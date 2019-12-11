#!/bin/bash

./main.sh $1 $2 $3 $4 $5 $6 $7 2>&1 | tee -a consoleLog/consoleOutput.txt &
/bin/bash
