package springkafka.xmlbased;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;

public class SimpleConsumer3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appcontext=new ClassPathXmlApplicationContext("xmlbased.xml");
        KafkaMessageListenerContainer<String,String> container = (KafkaMessageListenerContainer<String,String>)appcontext.getBean("container");
        System.out.println("container bean:"+container.isAutoStartup());
    }
}
