package com.anupama.sinha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IbmMqController {
    @Autowired
    JmsTemplate jmsTemplate;

    @GetMapping("/msg")
    String getMsg() {
        jmsTemplate.convertAndSend("DEV.QUEUE.1","Anupama, This is special message from IBM MQ. Listen to it please...");
        return "Message read Anupama";
    }
}
