package kafkastream.springbootbased;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.annotation.KafkaStreamsDefaultConfiguration;
import org.springframework.kafka.config.KafkaStreamsConfiguration;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@EnableKafkaStreams
@Configuration
public class config {
    final static String INPUT_TOPIC  = "efi.streamCatalogFixtureTopic";
    final static String OUTPUT_TOPIC = "efi.catalogFixtureTopic";

    @Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME)
    public KafkaStreamsConfiguration kafkaConfig() {
        final Map<String, Object> props = new HashMap<>();

        props.putIfAbsent(StreamsConfig.APPLICATION_ID_CONFIG, "stream-pipe");
        props.putIfAbsent(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.putIfAbsent(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.putIfAbsent(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());

        return new KafkaStreamsConfiguration(props);

    }

    @Bean
    public KStream<Object, Object> pipeStream(
            StreamsBuilder kStreamBuilder
    ) {

        KStream<Object, Object> stream = kStreamBuilder.stream(INPUT_TOPIC);
        stream.to(OUTPUT_TOPIC);

        return stream;
    }

}
