package com.demo.engine;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) {
    	try {
    		 System.out.println("Consumed message -> "+message);
    	} catch(Exception e){
    		System.out.println("Exception Occur During Consuming ");
    	}
    }
}
