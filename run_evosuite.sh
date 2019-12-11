#!/bin/bash

project=$1
flagmodel=$2
flagtest=$3
clone_seed_p=$4
class=$5
i=$6

population=$7
search_budget=$8

cbehavioreval=$9
LIMIT=${10}
exe_count_file=${11}

function waitForResources {
  sleep 20
  echo "Current #java processes:"
  echo $(pgrep -l java | wc -l)
  # If the number of active processes reaches the limit, we will wait, in the following loop, until the end of one of the EvoSuite executions.
  while (( $(pgrep -l java | wc -l) >= $LIMIT ))
  do
    echo $(pgrep -l java | wc -l)
    sleep 20
  done
}

projectCP=$(python python/generateProjectCP.py "bins/$project")
      if [ "$flagmodel" -eq 1 ]; then
        # model_seeding execution mode
        echo "Model seeding is on - seed_clone=$clone_seed_p"
        model_dir="analysis-result/$project/models"
        generatedTestDir="generated_tests/model_seeding/$project-$class-$clone_seed_p-$i"
        if [ -d "$generatedTestDir" ]; then
          echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          continue
        fi
        java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=$population -Dsearch_budget=$search_budget  -Dshow_progress=FALSE -projectCP "$projectCP" -class "$class" -Dseed_clone="$clone_seed_p" -Donline_model_seeding=TRUE -Dmodel_path="$model_dir" -Dtest_dir="generated_tests/model_seeding/$project-$class-$clone_seed_p-$i" > "logs/model_seeding/$project-$class-$clone_seed_p-$i-out.txt" 2> "logs/model_seeding/$project-$class-$clone_seed_p-$i-err.txt" &
        pid=$!
        . parsing.sh "model" $population $search_budget $pid $i $project $class $clone_seed_p $generatedTestDir &
        # Parse the execution log and save the useful information in to the model_seeding csv file
      elif [[ "$flagtest" -eq 1  ]]; then
        # test_seeding execution mode
        junits=$(python python/collect-junits.py $project $class)
        # Check if we have relative tests for the target class or not.
        if [[ -z "$junits" ]]; then
          echo "There is no test for class $class. Test seeding is skipped"
          # If we donot have one, we will skip test_seeding because test_seeding without test is equivalent to no_seeding.
       else
         echo "Test seeding is on - seed_clone=$clone_seed_p"
         generatedTestDir="generated_tests/test_seeding/$project-$class-$clone_seed_p-$i"
         if [ -d "$generatedTestDir" ]; then
          echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          continue
         fi
         java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=$population -Dsearch_budget=$search_budget -Dshow_progress=FALSE  -projectCP "$projectCP" -class "$class" -Dseed_clone="$clone_seed_p" -Dcarve_object_pool=TRUE -Dselected_junit="$junits" -Dtest_dir="generated_tests/test_seeding/$project-$class-$clone_seed_p-$i" > "logs/test_seeding/$project-$class-$clone_seed_p-$i-out.txt" 2> "logs/test_seeding/$project-$class-$clone_seed_p-$i-err.txt" &
         pid=$!
         . parsing.sh "test" $population $search_budget $pid $i $project $class $clone_seed_p $generatedTestDir &
         # Parse the execution log and save the useful information in to the test_seeding csv file
        fi
      else
        if [ "$cbehavioreval" -eq 1 ]; then
          #Common behavior executions
          echo "Will execute EvoSuite in 6 different modes for this class"

          # Mode 1: plain MOSA
          waitForResources
          echo "Mode 1: plain MOSA"
          generatedTestDir="generated_tests/cub_test_gen/fit_def_sec_def/$project-$class-$clone_seed_p-$i"
          if [ -d "$generatedTestDir" ]; then
            echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          else
            java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
             -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_def_sec_def-$i" \
             -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH \
             -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount \
             -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_def_sec_def/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_def_sec_def/$project-$class-$i-err.txt" &

            pid=$!
            . finish_detection.sh "no" $population $search_budget $pid $i $project $class $generatedTestDir 1 &
          fi

          # Mode 2: MOSA with max. fitness function, and max. secondary objective
          waitForResources
          echo "Mode 2: MOSA with max. fitness function, and max. secondary objective"
          generatedTestDir="generated_tests/cub_test_gen/fit_max_sec_max/$project-$class-$clone_seed_p-$i"
          if [ -d "$generatedTestDir" ]; then
            echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          else
            java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
             -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_max_sec_max-$i" \
             -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH:MAX_EXEC_COUNT \
             -Dsecondary_objectives=total_length:max_exec_count -Dsecondary_objective_voting=weighted -Dsecondary_objective_weights=1:2 \
             -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount \
             -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_max_sec_max/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_max_sec_max/$project-$class-$i-err.txt" &

            pid=$!
            . finish_detection.sh "no" $population $search_budget $pid $i $project $class $generatedTestDir 2 &
          fi

          # Mode 3: MOSA with min. fitness function, and min. secondary objective
          waitForResources
          echo "Mode 3: MOSA with min. fitness function, and min. secondary objective"
          generatedTestDir="generated_tests/cub_test_gen/fit_min_sec_min/$project-$class-$clone_seed_p-$i"
          if [ -d "$generatedTestDir" ]; then
            echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          else
            java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
             -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_min_sec_min-$i" \
             -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH:MIN_EXEC_COUNT \
             -Dsecondary_objectives=total_length:min_exec_count -Dsecondary_objective_voting=weighted -Dsecondary_objective_weights=1:2 \
             -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount \
             -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_min_sec_min/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_min_sec_min/$project-$class-$i-err.txt" &

            pid=$!
            . finish_detection.sh "no" $population $search_budget $pid $i $project $class $generatedTestDir 3 &
          fi

          # Mode 4: MOSA with default fitness function, and max. secondary objective
          waitForResources
          echo "Mode 4: MOSA with default fitness function, and max. secondary objective"
          generatedTestDir="generated_tests/cub_test_gen/fit_def_sec_max/$project-$class-$clone_seed_p-$i"
          if [ -d "$generatedTestDir" ]; then
            echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          else
            java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
             -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_def_sec_max-$i" \
             -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH \
             -Dsecondary_objectives=total_length:max_exec_count -Dsecondary_objective_voting=weighted -Dsecondary_objective_weights=1:2 \
             -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount \
             -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_def_sec_max/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_def_sec_max/$project-$class-$i-err.txt" &

            pid=$!
            . finish_detection.sh "no" $population $search_budget $pid $i $project $class $generatedTestDir 4 &
          fi

          # Mode 5: MOSA with default fitness function, and min. secondary objective
          waitForResources
          echo "Mode 5: MOSA with default fitness function, and min. secondary objective"
          generatedTestDir="generated_tests/cub_test_gen/fit_def_sec_min/$project-$class-$clone_seed_p-$i"
          if [ -d "$generatedTestDir" ]; then
            echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          else
            java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
             -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_def_sec_min-$i" \
             -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH \
             -Dsecondary_objectives=total_length:min_exec_count -Dsecondary_objective_voting=weighted -Dsecondary_objective_weights=1:2 \
             -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount \
             -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_def_sec_min/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_def_sec_min/$project-$class-$i-err.txt" &

            pid=$!
            . finish_detection.sh "no" $population $search_budget $pid $i $project $class $generatedTestDir 5 &
          fi

          # Mode 6: MOSA with max+min fitness function, default secondary objective
          waitForResources
          echo "Mode 6: MOSA with max+min fitness function, default secondary objective"
          generatedTestDir="generated_tests/cub_test_gen/fit_max_min_sec_def/$project-$class-$clone_seed_p-$i"
          if [ -d "$generatedTestDir" ]; then
            echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          else
            java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dstrategy=MOSUITE -Dalgorithm=MOSA -Dstop_zero=false \
             -Dshow_progress=FALSE -Dexe_count_file="$exe_count_file" -Dconfiguration_id="$class-fit_max_min_sec_def-$i" \
             -Dcriterion=LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH:MAX_EXEC_COUNT:MIN_EXEC_COUNT \
             -Doutput_variables=TARGET_CLASS,strategy,algorithm,criterion,secondary_objectives,search_budget,Lines,Covered_Lines,LineCoverage,Total_Branches,Covered_Branches,BranchCoverage,ExceptionCoverage,WeakMutationScore,OutputCoverage,MethodCoverage,MethodNoExceptionCoverage,CBranchCoverage,Size,Statements_Executed,Total_Time,random_seed,Generations,SummedAverageExecutionCount \
             -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/cub_test_gen/fit_max_min_sec_def/$project-$class-$i-out.txt" 2> "logs/cub_test_gen/fit_max_min_sec_def/$project-$class-$i-err.txt" &

            pid=$!
            . finish_detection.sh "no" $population $search_budget $pid $i $project $class $generatedTestDir 6 &
          fi


          # Mode x: NSGA-II with new min/max execution count fitness functions
          # waitForResources
          # echo "Mode 3: NSGA-II with new min/max execution count fitness functions"
          # echo "Not yet implemented"

          # Mode x: plain EvoSuite
          #waitForResources
          #echo "Mode 1: plain EvoSuite"
          #generatedTestDir="generated_tests/no_seeding/$search_budget/plain_es/$project-$class-$clone_seed_p-$i"
          #if [ -d "$generatedTestDir" ]; then
          #  echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
          #else
          #  java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -Dstop_zero=false -Dshow_progress=FALSE  -projectCP "$projectCP" -class "$class" -Dtest_dir="$generatedTestDir" > "logs/no_seeding/$search_budget/plain_es/$project-$class-$i-out.txt" 2> "logs/no_seeding/$search_budget/plain_es/$project-$class-$i-err.txt" &
          #fi

        else
          # no_seeding execution mode
          echo "No seeding is on"
          echo "$projectCP"
          generatedTestDir="generated_tests/no_seeding/$search_budget/$project-$class-$clone_seed_p-$i"
          if [ -d "$generatedTestDir" ]; then
            echo "Skip execution because of existing generated test: class= $class, project= $project, execution_idx= $i, modelFlag=$flagmodel, TestFlag=$flagtest"
            continue
          fi
          java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=$population -Dsearch_budget=$search_budget -Dshow_progress=FALSE  -projectCP "$projectCP" -class "$class" -Dtest_dir="generated_tests/no_seeding/$search_budget/$project-$class-$clone_seed_p-$i" > "logs/no_seeding/$search_budget/$project-$class-$i-out.txt" 2> "logs/no_seeding/$search_budget/$project-$class-$i-err.txt" &
          pid=$!
          . parsing.sh "no" $population $search_budget $pid $i $project $class $generatedTestDir &
          # Parse the execution log and save the useful information in to the no_seeding csv file
        fi
      fi
