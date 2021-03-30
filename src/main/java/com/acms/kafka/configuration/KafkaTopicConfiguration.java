package com.acms.kafka.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic acmsTopic(){
        return TopicBuilder
                .name("acmsTopic")
                .partitions(2)
                .build();
    }
}
