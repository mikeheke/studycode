#!/bin/bash
#program test
PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~/bin
export PATH

#write your shell script 

echo "a*b=c \n"
read -p "please input your first number: " num1
read -p "please input your second number: " num2
total=$(($num1*num2))
echo "result: $total" 
