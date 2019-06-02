package apachekafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class SimpleProducer1 {

    public static void main(String args[]){

        String topicname="topic1";
        Properties props=new Properties();

        props.put("bootstrap.servers","localhost:9092");
        props.put("acks","all");
        props.put("retries","0");
        props.put("batch.size","16384");
        props.put("linger.ms","1");
        props.put("buffer.memory","33554432");
        props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<Object, Object> producer = new KafkaProducer<>(props);

        for(int i=1;i<=5;i++){
            producer.send(new ProducerRecord<>(topicname,"apacheBasics","value-"+i));

        }
        producer.close();
        System.out.println("producer stopped.");

    }
}
