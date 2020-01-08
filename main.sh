#!/bin/bash

rounds=$1
classes=$2
LIMIT=$3
search_budget=$4
exec_count_file=$5

echo "Round = $rounds"
echo "classes file = $classes"
echo "LIMIT = $LIMIT"

for ((i=1;i<=$rounds;i++));
do
 echo "Round $i experiment"
 # for each class which is indicated in the classes.csv file
 while read class project
  do
    budget_list=($search_budget)
    for current_budget in "${budget_list[@]}" ; do
        printf 'Running test generation for %s\n' "$class in $project"
        echo "Budget: $current_budget"
        . run_evosuite.sh $project $class $i $current_budget $LIMIT $exec_count_file
    done

    sleep 1
    # If the number of active processes reaches the limit, we will wait, in the following loop, until the end of one of the EvoSuite executions.
    while (( $(pgrep -l java | wc -l) >= $LIMIT ))
    do
      sleep 1
    done

  done < "$classes"
done
