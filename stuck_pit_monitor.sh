#!/bin/bash

while true
do
  pgrep -f "org\.pitest\..+Minion" | while read current_pid
  do
    exec_time="$(ps -o etimes= -p $current_pid | tr -d '[:space:]')"
    parent_pid="$(ps -o ppid= -p $current_pid)"
    if [[ $exec_time =~ ^[0-9]+$ ]] && [[ $parent_pid =~ ^[0-9]+$ ]]
    then
      if [ "$exec_time" -gt 1800 ] || [ "$parent_pid" -eq 1 ]
      then
        echo $current_pid
      fi
    fi
  done | while read pid_to_kill
  do
    echo "Killing PIT process $(ps -o pid=,args= -p $pid_to_kill)" | tee -a './killed-pit-processes.log'
    kill -9 $pid_to_kill
  done
  sleep 30
done
