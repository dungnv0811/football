package com.dungnv.football.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "home")
    public String hello() {
        return "van dung hello edited";
    }


    @GetMapping(value = "private")
    public String manage() {
        return "this is for private";
    }
}
