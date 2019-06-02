package springkafka.annotationbased;

import org.springframework.kafka.annotation.KafkaListener;

public class Listener {

    @KafkaListener(topics="topic1",groupId = "consumergroup1",containerFactory = "kafkaContainFactory")
    public void listener(String msg){
        System.out.println("received msg:"+msg);
    }
}
