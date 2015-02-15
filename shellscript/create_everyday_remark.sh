#!/bin/bash
#program test
PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~/bin
export PATH

#write your shell script 

#current date: yyyymmdd
curdate=$(date "+%Y%m%d")

#echo "$curdate"
filepath="/home/mike/Desktop/everyday"
filename="$curdate.txt"
dir="$curdate"

#create file,directory
touch "$filepath/$filename"
mkdir "$filepath/$curdate"

#open file
gedit "$filepath/$filename" &
