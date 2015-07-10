#!/bin/bash

export locator_ip=localhost
export locator_port=10334

. ./setup.sh

gfsh <<!
connect --locator=$locator_ip[$locator_port];
shutdown --time-out=60
Y
stop locator --name=locator1;
exit;
!

