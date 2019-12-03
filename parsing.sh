#!/bin/bash

type=$1
population=$2
search_budget=$3
pid=$4
execution_idx=$5
project=$6
class=$7
flagmodel=0
flagtest=0
if [ "$type" != "no" ]; then
  clone_seed_p=$8
  resultDir=$9
  if [ "$type" == "model" ]; then
    flagmodel=1
  else
    flagtest=1
  fi
else
  clone_seed_p=0
  resultDir=$8
fi

# Wait until the process with the passed pid ends.
while kill -0 "$pid"; do
            sleep 1
done

if [ -d "$resultDir" ]; then
echo "Finished: class= $class, project= $project, execution_idx= $execution_idx, modelFlag=$flagmodel, TestFlag=$flagtest"
  # Parsing the final results
  if [ "$type" != "no" ]; then
    # Parsing test_seeding & model_seeding executions
    python python/write_on_csv_file.py $type $execution_idx $project $class $clone_seed_p &
  else
    # Parsing no_seeding executions
    python python/write_on_csv_file.py $type $execution_idx $project $class &
  fi
else
  # Check the root of problem
  if [ "$type" != "no" ]; then
    errLogDir="logs/${type}_seeding/$project-$class-$clone_seed_p-$execution_idx-err.txt"
  else
    errLogDir="logs/${type}_seeding/$project-$class-$execution_idx-err.txt"
  fi
  lastLine=$(awk '/./{line=$0} END{print line}' $errLogDir)
  if [[ $lastLine == *"Connecting to master process on port"* ]]; then
    # Re-run the EvoSuite process
    echo "ReRun: class= $class, project= $project, execution_idx= $execution_idx, modelFlag=$flagmodel, TestFlag=$flagtest"
    . run_evosuite.sh $project $flagmodel $flagtest $clone_seed_p $class $execution_idx $population $search_budget &
  else
    echo "Problem: class= $class, project= $project, execution_idx= $execution_idx, modelFlag=$flagmodel, TestFlag=$flagtest"
    cat $errLogDir
  fi
  
fi


