#!/bin/bash

while true
do
  pgrep -f "org\.pitest\..+Minion" | while read current_pid
  do
    if [ "$(ps -o etimes= -p $current_pid)" -gt 1800 ] || [ "$(ps -o ppid= -p $current_pid)" -eq 1 ]
    then
      echo $current_pid
    fi
  done | while read pid_to_kill
  do
    echo "Killing PIT process $(ps -o pid=,args= -p $pid_to_kill)" | tee -a './killed-pit-processes.log'
    kill -9 $pid_to_kill
  done
  sleep 30
done
