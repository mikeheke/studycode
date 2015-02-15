#!/bin/bash
#program test
PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~/bin
export PATH

#write your shell script 

echo "this shell script will check your input's filename is exist,type and permission. \n"
read -p "please input your filename: " filename
test ! -e $filename && echo "Your input $filename is not exist! " && exit 0 || echo "filename $filename is exist." 
test -f $filename && filetype="regular file" || filetype="directory"
test -r $filename && filepermission="readable"
test -w $filename && filepermission="$filepermission,writable"
test -x $filename && filepermission="$filepermission,executable"

echo "Your input $filename is a $filetype."
echo "$filename's permission is $filepermission."
