package com.io.github.anantharajuc.kafkademo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkalIsteners {

    @KafkaListener(topics = "quickstart", groupId = "foo")
    void listener(String data){
        System.out.println("Listener received: "+ data);
    }
}
