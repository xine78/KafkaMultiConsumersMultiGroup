package com.acms.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {
    @KafkaListener(topics="kafkaTutorial")
    public void listenKafka(String message){
        log.info("Message coming from Kafka {}", message);
    }
}
