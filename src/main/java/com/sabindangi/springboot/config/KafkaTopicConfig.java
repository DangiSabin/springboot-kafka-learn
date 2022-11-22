package com.sabindangi.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic kafkaDemoTopic(){
		return TopicBuilder.name("topic1").build();
	}
	
	@Bean
	public NewTopic kafkaDemoJsonTopic(){
		return TopicBuilder.name("topic1_json").build();
	}
}
