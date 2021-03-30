package com.acms.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics="acmsTopic_1")
    public void listenAcmsTopic1(String message){
        log.info("Topic : acmsTopic_1 - Message coming from Kafka {}", message);
    }

    @KafkaListener(topics="acmsTopic_2")
    public void listenAcmsTopic2(String message){
        log.info("Topic : acmsTopic_2 - Message coming from Kafka {}", message);
    }
}
