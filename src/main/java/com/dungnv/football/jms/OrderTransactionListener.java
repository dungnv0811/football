package com.dungnv.football.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class OrderTransactionListener {

    @JmsListener(destination = "myChanel", containerFactory = "jmsListenerContainerFactory")
    public void handleMessage(String message) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("chao van dung ne");
        System.out.println(message);
    }
}
