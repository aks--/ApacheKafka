package springkafka.annotationbased;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

public class SimpleProducer4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appcontxt = new ClassPathXmlApplicationContext("annotationbased.xml");

        KafkaTemplate<String, String> template = (KafkaTemplate<String, String>) appcontxt.getBean("kafkaTemplate");

        String topic="topic1";
        for(int i=1;i<=5;i++)
        template.send(topic,"annotationabsed","val$$-"+i);

        template.flush();
        System.out.println("producer stopped.");
    }

}
