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

configurationId=$9


# Wait until the process with the passed pid ends.
while kill -0 "$pid"; do
            sleep 1
done

if [ -d "$resultDir" ]; then
echo "Finished: class= $class, project= $project, execution_idx= $execution_idx, modelFlag=$flagmodel, TestFlag=$flagtest, configurationId=$configurationId"
else
  # Check the root of problem
    echo "Problem: class= $class, project= $project, execution_idx= $execution_idx, modelFlag=$flagmodel, TestFlag=$flagtest, configurationId=$configurationId"
fi
