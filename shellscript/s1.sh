#!/bin/bash
#program test
PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~/bin
export PATH

#write your shell script 

_whoami=$(whoami)
_pwd=$(pwd)
echo "who am i: $_whoami \n"
echo "current dir: $_pwd \n"
