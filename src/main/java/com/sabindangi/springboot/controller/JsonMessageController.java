package com.sabindangi.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabindangi.springboot.kafka.JsonKafkaProducer;
import com.sabindangi.springboot.payload.User;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
	
	private JsonKafkaProducer kafkaProducer;

	public JsonMessageController(JsonKafkaProducer kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}
	
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user){
		
		kafkaProducer.sendMessage(user);
		
		return ResponseEntity.ok("Json message sent to Kafka topic");
	}
	
}
