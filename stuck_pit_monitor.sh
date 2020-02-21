#!/bin/bash

while true
do
  pgrep -f "org\.pitest\..+Minion" | while read current_pid
  do
    if [ "$(xargs ps -o etimes= -p $current_pid)" -gt 1800 ] || [ "$(xargs ps -o ppid= -p $current_pid)" -eq 1 ]
    then
      echo $current_pid
    fi
  done | while read pid_to_kill
    do
      ps -o args -p $pid_to_kill &>> './killed-pit-processes.log'
      xargs pkill -9 $pid_to_kill
    done
  sleep 30
done
