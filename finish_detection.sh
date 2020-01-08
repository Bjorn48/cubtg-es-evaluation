#!/bin/bash

pid=$1
execution_idx=$2
project=$3
class=$4
resultDir=$5
configurationId=$6


# Wait until the process with the passed pid ends.
while kill -0 "$pid"; do
            sleep 1
done

if [ -d "$resultDir" ]; then
echo "Finished: class= $class, project= $project, execution_idx= $execution_idx, configurationId=$configurationId"
else
  # Check the root of problem
    echo "Problem: class= $class, project= $project, execution_idx= $execution_idx, configurationId=$configurationId"
fi
