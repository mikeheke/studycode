#!/bin/bash
#program test
PATH=/bin:/sbin:/usr/bin:/usr/sbin:/usr/local/bin:/usr/local/sbin:~/bin
export PATH

#write your shell script 

echo "Now, I will detect your linux server's services."

testing=$(netstat -tuln | grep ":22")

if [ "$testing" != "" ]; then
	echo "SSH is running in your linux server."
else
	echo "SSH is not running in your linux server."
fi
