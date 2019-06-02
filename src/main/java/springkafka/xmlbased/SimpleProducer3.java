package springkafka.xmlbased;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

public class SimpleProducer3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext("xmlbased.xml");
        KafkaTemplate<String,String> kfktemplate = (KafkaTemplate<String,String>) appcontext.getBean("kafkaTemplate");

        String topicName="topic1";
        System.out.println("producer started...");

        kfktemplate.send(topicName,"xmlbased","valuexml1");
        kfktemplate.send(topicName,"xmlbased","valuexml2");
        kfktemplate.send(topicName,"xmlbased","valuexml3");
        kfktemplate.send(topicName,"xmlbased","valuexml4");

        kfktemplate.flush();
        System.out.println("producer end.");
    }
  
}
