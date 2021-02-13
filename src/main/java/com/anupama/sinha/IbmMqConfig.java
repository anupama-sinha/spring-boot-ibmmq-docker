package com.anupama.sinha;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Configuration
public class IbmMqConfig {

    @JmsListener(destination = "DEV.QUEUE.1")
    public void getMessage(String msg){
        log.info("Message from IBM MQ => {}", msg);
    }
}
