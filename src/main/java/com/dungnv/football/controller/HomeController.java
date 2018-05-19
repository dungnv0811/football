package com.dungnv.football.controller;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final JmsTemplate jmsTemplate;

    public HomeController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping(value = "home")
    public String hello() {
        jmsTemplate.convertAndSend("myChanel", "hello world");
        return "van dung hello edited";
    }


    @GetMapping(value = "private")
    public String manage() {
        return "this is for private";
    }
}
