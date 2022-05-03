## do not attempt this, work in progress for future class

1  wget https://downloads.apache.org/hadoop/common/hadoop-3.2.1/hadoop-3.2.1.tar.gz
    2  wget https://archive.apache.org/dist/hadoop/common/hadoop-3.2.1/hadoop-3.2.1.tar.gz
    3  tar xzf hadoop-3.2.1.tar.gz
    4  sudo nano .bashrc
    5  usermod -aG sudo hdoop
    6  sudo usermod -aG sudo hdoop
    7  sudo nano .bashrc
    8  whoami
    9  pwd
   10  nano .bashrc 
   11  source ~/.bashrc
   12  sudo nano $HADOOP_HOME/etc/hadoop/hadoop-env.sh
   13  nano $HADOOP_HOME/etc/hadoop/core-site.xml
   14  nano $HADOOP_HOME/etc/hadoop/hdfs-site.xml
   15  nano $HADOOP_HOME/etc/hadoop/mapred-site.xml
   16  nano $HADOOP_HOME/etc/hadoop/yarn-site.xml
   17  hdfs namenode -format
   18  ./start-dfs.sh
   19  $HADOOP_HOME/sbin/start-dfs.sh
   20  jps
   21  $HADOOP_HOME/sbin/start-yarn.sh
   22  ifconfig
   23  ipconfig
   24  wget localhost:50070
   25  wget 127.0.0.1:50070
   26  jps
   27  hdfs dfs -ls /
   28  hdfs dfs -mkdir /test
   29  touch employees.csv
   30  cat "jo,22" >> employees.csv 
   31  echo  "jo,22" >> employees.csv 
   32  echo "marry,24" >> employees.csv 
   33  hdfs dfs -put employees.csv /test
   34  hdfs dfs -ls /test
   35  hdfs dfs -cat /test/employees.csv
   36  history 


Ref: https://phoenixnap.com/kb/install-hadoop-ubuntu

