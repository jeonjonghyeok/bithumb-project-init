package jjh.api.quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class KafkaProducer {
    private static final String TOPIC = "quiz";
    private final KafkaTemplate<String, String> kafkaTemplate;
    public void sendMessage(String message) {
        System.out.println(" Producer Message " +message);
    }
}
