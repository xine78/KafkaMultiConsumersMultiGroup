package com.acms.kafka.controller;

import com.acms.kafka.producer.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    @Autowired
    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/sendMessage")
    public void sendMessage(@RequestParam String message, @RequestParam String topic){
        this.kafkaProducer.sendMessageToTopic(message, topic);
        log.info(message);
    }
}
