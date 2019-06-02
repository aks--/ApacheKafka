package springkafka.annotationbased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleConsumer4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext("annotationbased.xml");
    }
}
