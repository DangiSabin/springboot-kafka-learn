package com.sabindangi.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.sabindangi.springboot.payload.User;

@Service
public class JsonKafkaConsumer {
	
private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics="topic1_json",groupId="myGroup")
	public void consume(User user){
		
		LOGGER.info(String.format("Json message received -> %s", user.toString()));
	}

}
