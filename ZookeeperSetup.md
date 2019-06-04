Ubuntu zookeeper setup :
---------------------------------------------------------------------------------
Apache zookeeper Wiki :

    http://zookeeper.apache.org/doc/current/zookeeperStarted.html

download:

    https://archive.apache.org/dist/zookeeper/zookeeper-3.4.6/
    
    wget https://archive.apache.org/dist/zookeeper/zookeeper-3.4.6/zookeeper-3.4.6.tar.gz
    

unzip:

    tar -xvf zookeeper-3.4.6.tar.gz

rename this file conf/zoo_sample.cfg to conf/zoo.cfg and add below lines:

    tickTime=2000
    dataDir=/path/to/zookeeper/data
    clientPort=2181
    initLimit=5
    syncLimit=2

Start:

    bin/zkServer.sh start

Stop:

    bin/zkServer.sh stop

Status:

    bin/zkServer.sh status

Cli:

    bin/zkCli.sh -server 127.0.0.1:2181


