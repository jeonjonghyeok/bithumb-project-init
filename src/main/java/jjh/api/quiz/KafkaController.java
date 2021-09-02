package jjh.api.quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final KafkaProducer producer;

    @GetMapping
    public String hello() {
        return "Hello Kafka";
    }

    @PostMapping
    public String sendMessage(@RequestParam("message") String message) {
        System.out.println("####################### producer 진입 ###################");
        this.producer.sendMessage(message);
        return "Message Sent to kafka Successfully";
    }
}
