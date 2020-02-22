scaffoldingTest=$1
configuration=$2
folderName=$3
proc_threads=$5
out_file=$6
err_file=$7

function execute_pit {
    # The java command has to point to Java 8
    java -cp $classPaths org.pitest.mutationtest.commandline.MutationCoverageReport \
      --reportDir $outDir \
      --targetClasses $target_class \
      --targetTests $target_class"_ESTest" \
      --mutableCodePaths "$mutableCPs" \
      --testPlugin evosuite \
      --sourceDirs $sourceDirs \
      --mutators ALL \
      --timestampedReports=false \
      --outputFormats "HTML,XML,CSV" \
      --threads $proc_threads \
	    --verbose=true
}

# Collect test suite information, like project name, target class, etc.
IFS='-' read -r -a usefulStuff <<< "$folderName"
project_name="${usefulStuff[0]}"
target_class="${usefulStuff[1]}"
clone_seed_p="${usefulStuff[2]}"
execution_id="${usefulStuff[3]}"
echo "project: "$project_name
echo "target_class: "$target_class
echo "clone_seed_p: "$clone_seed_p
echo "execution_id: "$execution_id
projectCP=$(ls -d -1 "$PWD/bins/$project_name/"* | tr '\n' ':')
test_execution_libs=$(ls -p "$PWD/pitest/libs/test_execution/"* | tr '\n' ':')

# 1- Compile scaffolding and main test
javac -cp "$projectCP$test_execution_libs" $scaffoldingTest
testDir=$(dirname $scaffoldingTest)
scaffodlingClassPathEntryDir="generated_tests/cub_test_gen/$configuration/$folderName"
find $testDir -type f -name "*_ESTest.java" | while read mainTest; do
  javac -cp "$projectCP$test_execution_libs$scaffodlingClassPathEntryDir" $mainTest

    pitestLibs=$(ls -d -1 "pitest/libs/pitest/"* | tr '\n' ':')

    # 2- Run pitest
    classPaths="$projectCP$test_execution_libs$scaffodlingClassPathEntryDir:$pitestLibs"
    sourceDirs="sources/$project_name/src"
    outDir="pitest/out/cub_test_gen/$configuration/$project_name-$target_class-$clone_seed_p-$execution_id"
    mutableCPs=$(python pitest/scripts/python/export_mutable_cps.py $projectCP)

    execute_pit

    # 3- Check for flaky tests, and rerun without them if there are any
    contains_flaky=1
    flaky_retries=0
    while [ $contains_flaky -eq 1 ] && [ $flaky_retries -lt 5 ]
    do
      if grep -Eq "SEVERE : .+\[testClass=.+, name=(.+)\] did not pass without mutation\." "$err_file"
      then
        echo "[run_pitest_single_suite] Ignoring flaky tests and restarting PIT for $mainTest" | tee -a "rerun-flaky.log"
        java -jar pitest/libs/flaky_related/pit-log-test-fail-detector.jar $err_file | xargs -I {} java -jar pitest/libs/flaky_related/IgnoreAdder.jar $mainTest {}
        javac -cp "$projectCP$test_execution_libs$scaffodlingClassPathEntryDir" $mainTest

        rm -r $outDir
        execute_pit
        ((flaky_retries+=1))
      else
        contains_flaky=0
      fi
    done
done
