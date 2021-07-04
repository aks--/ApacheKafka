package apachekafka;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import kafkastream.springbootbased.App;

@SpringBootApplication
public class SimpleConsumer1 {
    public static void main(String args[]){
        SpringApplication.run(App.class);

        String topicName="topic1";
        Properties props=new Properties();
        props.put("bootstrap.servers","localhost:9092");
        props.put("group.id","consumergroup1");
        props.put("enable.auto.commit","true");
        props.put("auto.commit.interval.ms","1000");
        props.put("session.timeout.ms","30000");
        props.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer");

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Arrays.asList(topicName));

        System.out.println(" consumer started...");
        boolean flag=true;
        while(flag){

            ConsumerRecords<String, String> records = consumer.poll(100);
            for( ConsumerRecord<String, String> record:records) {

                System.out.println("records are : " + "key: " + record.key()+" value: " + record.value()+"  offset: " +record.offset()+ "  partition: "+record.partition());
            }
        }

        System.out.println("consumer stopped.");

    }
}
