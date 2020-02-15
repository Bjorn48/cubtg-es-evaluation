#!/bin/bash

project=$1
class=$2
i=$3
search_budget=$4
LIMIT=$5
exe_count_file=$6

function waitForResources {
  sleep 1
  echo "Current #java processes:"
  echo $(pgrep -l java | wc -l)
  # If the number of active processes reaches the limit, we will wait, in the following loop, until the end of one of the EvoSuite executions.
  while (( $(pgrep -l java | wc -l) >= $LIMIT ))
  do
    #echo $(pgrep -l java | wc -l)
    sleep 1
  done
}

projectCP=$(python python/generateProjectCP.py "bins/$project")
#Common behavior executions
echo "Will execute EvoSuite in 6 different modes for this class"

# Mode 1: plain MOSA
waitForResources
echo "Mode 1: plain MOSA"
generatedTestDir="generated_tests/cub_test_gen/fit_def_sec_def/$project-$class-1-$i"
if [ -d "$generatedTestDir" ]; then
  echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i"
else
  java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
   -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_def_sec_def-$i" \
   -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:INPUT:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH -Dsearch_budget=$search_budget \
   -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,InputCoverage,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount,configuration_id \
   -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_def_sec_def/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_def_sec_def/$project-$class-$i-err.txt" &

  pid=$!
  . finish_detection.sh $pid $i $project $class $generatedTestDir 1 &
fi

# Mode 2: MOSA with max. fitness function, and max. secondary objective
waitForResources
echo "Mode 2: MOSA with max. fitness function, and max. secondary objective"
generatedTestDir="generated_tests/cub_test_gen/fit_max_sec_max/$project-$class-1-$i"
if [ -d "$generatedTestDir" ]; then
  echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i"
else
  java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
   -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_max_sec_max-$i" \
   -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:INPUT:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH:MAX_EXEC_COUNT -Dsearch_budget=$search_budget \
   -Dsecondary_objectives=total_length:max_exec_count -Dsecondary_objective_voting=weighted -Dsecondary_objective_weights=1:2 \
   -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,InputCoverage,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount,configuration_id \
   -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_max_sec_max/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_max_sec_max/$project-$class-$i-err.txt" &

  pid=$!
  . finish_detection.sh $pid $i $project $class $generatedTestDir 2 &
fi

# Mode 3: MOSA with min. fitness function, and min. secondary objective
waitForResources
echo "Mode 3: MOSA with min. fitness function, and min. secondary objective"
generatedTestDir="generated_tests/cub_test_gen/fit_min_sec_min/$project-$class-1-$i"
if [ -d "$generatedTestDir" ]; then
  echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i"
else
  java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
   -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_min_sec_min-$i" \
   -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:INPUT:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH:MIN_EXEC_COUNT -Dsearch_budget=$search_budget \
   -Dsecondary_objectives=total_length:min_exec_count -Dsecondary_objective_voting=weighted -Dsecondary_objective_weights=1:2 \
   -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,InputCoverage,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount,configuration_id \
   -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_min_sec_min/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_min_sec_min/$project-$class-$i-err.txt" &

  pid=$!
  . finish_detection.sh $pid $i $project $class $generatedTestDir 3 &
fi

# Mode 4: MOSA with default fitness function, and max. secondary objective
waitForResources
echo "Mode 4: MOSA with default fitness function, and max. secondary objective"
generatedTestDir="generated_tests/cub_test_gen/fit_def_sec_max/$project-$class-1-$i"
if [ -d "$generatedTestDir" ]; then
  echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i"
else
  java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
   -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_def_sec_max-$i" \
   -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:INPUT:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH -Dsearch_budget=$search_budget \
   -Dsecondary_objectives=total_length:max_exec_count -Dsecondary_objective_voting=weighted -Dsecondary_objective_weights=1:2 \
   -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,InputCoverage,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount,configuration_id \
   -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_def_sec_max/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_def_sec_max/$project-$class-$i-err.txt" &

  pid=$!
  . finish_detection.sh $pid $i $project $class $generatedTestDir 4 &
fi

# Mode 5: MOSA with default fitness function, and min. secondary objective
waitForResources
echo "Mode 5: MOSA with default fitness function, and min. secondary objective"
generatedTestDir="generated_tests/cub_test_gen/fit_def_sec_min/$project-$class-1-$i"
if [ -d "$generatedTestDir" ]; then
  echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i"
else
  java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
   -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_def_sec_min-$i" \
   -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:INPUT:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH -Dsearch_budget=$search_budget \
   -Dsecondary_objectives=total_length:min_exec_count -Dsecondary_objective_voting=weighted -Dsecondary_objective_weights=1:2 \
   -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,InputCoverage,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount,configuration_id \
   -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_def_sec_min/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_def_sec_min/$project-$class-$i-err.txt" &

  pid=$!
  . finish_detection.sh $pid $i $project $class $generatedTestDir 5 &
fi

# Mode 6: MOSA with max+min fitness function, default secondary objective
waitForResources
echo "Mode 6: MOSA with max+min fitness function, default secondary objective"
generatedTestDir="generated_tests/cub_test_gen/fit_max_min_sec_def/$project-$class-1-$i"
if [ -d "$generatedTestDir" ]; then
  echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i"
else
  java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
   -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_max_min_sec_def-$i" \
   -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:INPUT:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH:MAX_EXEC_COUNT:MIN_EXEC_COUNT -Dsearch_budget=$search_budget \
   -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,InputCoverage,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount,configuration_id \
   -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_max_min_sec_def/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_max_min_sec_def/$project-$class-$i-err.txt" &

  pid=$!
  . finish_detection.sh $pid $i $project $class $generatedTestDir 6 &
fi


# Mode 7: NSGA-II with max. execution count fitness functions + max. secondary objective
waitForResources
echo "Mode 7: NSGA-II with max. execution count fitness functions + max. secondary objective"
generatedTestDir="generated_tests/cub_test_gen/nsgaii_max/$project-$class-1-$i"
if [ -d "$generatedTestDir" ]; then
  echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i"
else
  java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -Dalgorithm=NSGAII -Dstop_zero=false \
   -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-nsgaii_max-$i" \
   -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:INPUT:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH:MAX_EXEC_COUNT -Dsearch_budget=$search_budget \
   -Dsecondary_objectives=total_length:max_exec_count -Dsecondary_objective_voting=weighted -Dsecondary_objective_weights=1:2 \
   -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,InputCoverage,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount,configuration_id \
   -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/nsgaii_max/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/nsgaii_max/$project-$class-$i-err.txt" &

  pid=$!
  . finish_detection.sh $pid $i $project $class $generatedTestDir 7 &
fi

# Mode 8: NSGA-II with min. execution count fitness functions + min. secondary objective
waitForResources
echo "Mode 8: NSGA-II with min. execution count fitness functions + min. secondary objective"
generatedTestDir="generated_tests/cub_test_gen/nsgaii_min/$project-$class-1-$i"
if [ -d "$generatedTestDir" ]; then
  echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i"
else
  java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -Dalgorithm=NSGAII -Dstop_zero=false \
   -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-nsgaii_min-$i" \
   -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:INPUT:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH:MIN_EXEC_COUNT -Dsearch_budget=$search_budget \
   -Dsecondary_objectives=total_length:min_exec_count -Dsecondary_objective_voting=weighted -Dsecondary_objective_weights=1:2 \
   -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,InputCoverage,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount,configuration_id \
   -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/nsgaii_min/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/nsgaii_min/$project-$class-$i-err.txt" &

  pid=$!
  . finish_detection.sh $pid $i $project $class $generatedTestDir 8 &
fi
