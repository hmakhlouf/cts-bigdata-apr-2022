 
```
wget https://archive.apache.org/dist/hadoop/common/hadoop-2.7.7/hadoop-2.7.7.tar.gz


tar xf hadoop-2.7.7.tar.gz
```


~ sign means, home directory of the user

```
nano ~/.bashrc
```

below to be copied into .bashrc


```
export HADOOP_HOME=/home/ubuntu/hadoop-2.7.7
export PATH=$PATH:$HADOOP_HOME/bin:$HADOOP_HOME/sbin
export CLASSPATH=$CLASSPATH:$HADOOP_HOME/lib/*:.
```

Ctrl + O = to write the file, Press enter key when prompted for file

Ctrl + X = to exit the nano editor



add below to /etc/environment file 

```
sudo nano /etc/environment
```

paste below at end of the file without messup existing content


```
JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
JRE_HOME=/usr/lib/jvm/java-8-openjdk-amd64
HADOOP_HOME=/home/ubuntu/hadoop-2.7.7
```


Ctrl + O = to write the file, Press enter key when prompted for file

Ctrl + X = to exit the nano editor

 

```
mv $HADOOP_HOME/etc/hadoop/core-site.xml $HADOOP_HOME/etc/hadoop/core-site.xml.original
mv $HADOOP_HOME/etc/hadoop/hdfs-site.xml $HADOOP_HOME/etc/hadoop/hdfs-site.xml.original
mv $HADOOP_HOME/etc/hadoop/mapred-site.xml $HADOOP_HOME/etc/hadoop/mapred-site.xml.original
mv $HADOOP_HOME/etc/hadoop/yarn-site.xml $HADOOP_HOME/etc/hadoop/yarn-site.xml.original
````


```

wget -P $HADOOP_HOME/etc/hadoop/ https://raw.githubusercontent.com/nodesense/kafka-workshop/master/hadoop/core-site.xml
wget -P $HADOOP_HOME/etc/hadoop/ https://raw.githubusercontent.com/nodesense/kafka-workshop/master/hadoop/hdfs-site.xml
wget -P $HADOOP_HOME/etc/hadoop/ https://raw.githubusercontent.com/nodesense/kafka-workshop/master/hadoop/mapred-site.xml
wget -P $HADOOP_HOME/etc/hadoop/ https://raw.githubusercontent.com/nodesense/kafka-workshop/master/hadoop/yarn-site.xml
```

Generate keygen so that hadoop can login  local ssh command

```
ssh-keygen -t rsa -P ""

cat $HOME/.ssh/id_rsa.pub >> $HOME/.ssh/authorized_keys
```

reboot system

```
reboot 
```

hadoop File System format and setup , for learning purpose, not good for prodution

```
ssh localhost

sudo mkdir -p /data/hdfs

sudo chmod -R 777 /data/hdfs

hdfs namenode -format

```

starting hadoop

```
start-all.sh
```

to check hadoop is running or not

```
jps
```

try this in ubuntu browser

http://localhost:50070


