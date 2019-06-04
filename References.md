spring properties:

https://www.baeldung.com/properties-with-spring

kafkaProducer class:

https://kafka.apache.org/22/javadoc/index.html?org/apache/kafka/clients/producer/KafkaProducer.html

spring kafka:

https://docs.spring.io/spring-kafka/docs/2.2.5.RELEASE/reference/#introduction

what is key in kafka message?

https://kafka.apache.org/082/javadoc/org/apache/kafka/clients/producer/ProducerRecord.html

enable.auto.commit ?

enable.auto.commit default value is true

else use  consumer.commitAsync() manually to update offset.

enable kafka:

https://docs.spring.io/spring-kafka/api/org/springframework/kafka/annotation/EnableKafka.html


Check if zookeeper port is in use or not by a process

Netstat -ap|grep 2181

Apache zookeeper Wiki :

http://zookeeper.apache.org/doc/current/zookeeperStarted.html
