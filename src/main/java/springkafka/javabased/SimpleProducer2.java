package springkafka.javabased;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.*;

public class SimpleProducer2 {

    public static void main(String args[]){
        


        String topicName="topic1";

        Map<String, Object> props = new HashMap<>();

        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        props.put(ProducerConfig.ACKS_CONFIG,"all");
        props.put(ProducerConfig.RETRIES_CONFIG,"0");
        props.put(ProducerConfig.BATCH_SIZE_CONFIG,"16384");
        props.put(ProducerConfig.LINGER_MS_CONFIG,"1");
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG,"33554432");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class);

        ProducerFactory<String,String> producerFactory = new DefaultKafkaProducerFactory<>(props);

        KafkaTemplate<String,String> kafkaTemplate = new KafkaTemplate<>(producerFactory);

        System.out.println("producer started...");
        for(int i=1;i<=5;i++){
            kafkaTemplate.send(topicName,"springKafka","valh-"+i+" :"+ new Date());
        }

        kafkaTemplate.flush();
        System.out.println("producer stopped...");
    }
}
