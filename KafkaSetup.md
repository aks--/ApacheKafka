# ApacheKafka

Windows Setup for kafka:
--------------------------
Local folder:
C:\anurag\software

1. install and run  zookeeper:
    https://zookeeper.apache.org/releases.html

    modify conf/zoo.cfg
    dataDir=C:/zookeeper/data
    add zookeeper/bin (C:\anurag\software\zookeeper-3.4.14\bin) location in PATH Environment variiable
    run zkserver

2. install and run  kafka server:
    https://kafka.apache.org/downloads
    modify  config/server.properties
    log.dirs=C:/kafka

    start kafka server
    bin\windows\kafka-server-start.bat config\server.properties

    stop kafka server
    bin/kafka-server-stop.bat config/server.properties

3. create topic

    C:\anurag\software\kafka_2.12-2.2.0
    bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1   --partitions 1 --topic Hello-Kafka

4. verify topic list

    C:\anurag\software\kafka_2.12-2.2.0
    bin\windows\kafka-topics.bat --list --zookeeper localhost:2181

5.start producer

    bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic Hello-Kafka

6.start consumer

    bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic Hello-Kafka --from-beginning




------------------------------------------------
Kafka Ubuntu setup:
-------------------------------------------------
Wiki:
https://kafka.apache.org/quickstart

Download kafka:
https://www.apache.org/dyn/closer.cgi?path=/kafka/2.2.0/kafka_2.11-2.2.0.tgz

unzip:
tar -xvf kafka_2.12-2.2.0.tgz

1. Start/stop the  dirty/single node zookeeper(available in kafka package already) :
    bin/zookeeper-server-start.sh config/zookeeper.properties
    bin/zookeeper-server-stop.sh config/zookeeper.properties


2.Start/Stop kafka server:
    bin/kafka-server-start.sh config/server.properties
    bin/zookeeper-server-stop.sh config/zookeeper.properties


3.Create topic:
    bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic topic1

4.Delete topic:
    bin/kafka-topics.sh --zookeeper localhost:2181 --delete --topic topic1

5.Disable deletion of topic:
    In kafka config/server.properties set delete.topic.enable value as false.
    delete.topic.enable=false

6.Verify topic list:
    bin/kafka-topics.sh --list --bootstrap-server localhost:9092


7.Start consumer:
    bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic1 --from-beginning

8.Start producer:
    bin/kafka-console-producer.sh --broker-list  localhost:9092 --topic topic1










