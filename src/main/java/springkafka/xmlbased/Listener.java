package springkafka.xmlbased;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

public class Listener implements MessageListener<String,String> {

    @Override
    public void onMessage(ConsumerRecord<String, String> data) {
        System.out.println("received msg: "+data);
    }
}
