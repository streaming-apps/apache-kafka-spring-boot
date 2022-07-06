package com.io.github.anantharajuc.kafkademo.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;

@RestController
@RequestMapping("api/v1/messages")
public class BrokerController {

    private KafkaTemplate<String, String> kafkaTemplate;

    public BrokerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping
    public void publishMessageToBroker(){
        Date date = new Date();
        kafkaTemplate.send("quickstart", String.valueOf(new Timestamp(date.getTime())));
    }
}
