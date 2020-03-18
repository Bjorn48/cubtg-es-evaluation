#!/bin/bash

LIMIT=$1
proc_threads=$2
user_id=$3

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

# Start a monitor which kills stuck PIT processes
./stuck_pit_monitor.sh &
stuck_monitor_pid=$!

# A loop for running pit on all of the generated tests suites
num_tests=$(find generated_tests -type f -name "*_scaffolding.java" | wc -l)
proc_tests=0

find generated_tests -type f -name "*_scaffolding.java" | while read scaffoldingTest; do
    waitForResources
    ((proc_tests+=1))
    echo "Processing test: $proc_tests / $num_tests"

    echo "Processing file '$scaffoldingTest'"
    IFS='/' read -r -a dirs <<< "$scaffoldingTest"
    configuration="${dirs[2]}"
    echo "configuration: "$configuration
    folderName="${dirs[3]}"

    out_file="logs-pitest/cub-test-gen/$configuration/$folderName.log"
    err_file="logs-pitest/cub-test-gen/$configuration/$folderName.err"

    ./run_pitest_single_suite.sh $scaffoldingTest $configuration $folderName \
     $proc_threads $out_file $err_file &
done

# Kill stuck monitor
kill -9 $stuck_monitor_pid
