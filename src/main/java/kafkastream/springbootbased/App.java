package kafkastream.springbootbased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class App {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(App.class);
        System.out.println("start main");
        //Pipe.main(new String[]{});

    }

}
