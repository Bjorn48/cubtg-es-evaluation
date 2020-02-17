#!/bin/bash

LIMIT=$1
proc_threads=$2
user_id=$3

RunLimit=5

# Check if an array contains the given element
containsElement () {
  local e match="$1"
  shift
  for e; do [[ "$e" == "$match" ]] && return 1; done
  return 0
}

function waitForResources {
  sleep 1
  echo "Current #java processes:"
  echo $(pgrep -u $user_id -l java | wc -l)
  echo "Continuing once below $LIMIT"
  # If the number of active processes reaches the limit, we will wait, in the following loop, until the end of one of the EvoSuite executions.
  while (( $(pgrep -u $user_id -l java | wc -l) >= $LIMIT ))
  do
    sleep 1
  done
  echo "Enough resources to continue, current #java processes:"
  echo $(pgrep -u $user_id -l java | wc -l)
}

# A loop for running pit on all of the generated tests cases by botsing
num_tests=$(find generated_tests -type f -name "*_scaffolding.java" | wc -l)
proc_tests=0

find generated_tests -type f -name "*_scaffolding.java" | while read scaffoldingTest; do
    waitForResources
    ((proc_tests+=1))
    echo "Processing test: $proc_tests / $num_tests"

    ./run_pitest_single_suite.sh $scaffoldingTest $RunLimit \
     $proc_threads > "logs-pitest/cub-test-gen/$configuration/$folderName.log" 2> "logs-pitest/cub-test-gen/$configuration/$folderName.err" &
done
