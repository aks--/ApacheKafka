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

