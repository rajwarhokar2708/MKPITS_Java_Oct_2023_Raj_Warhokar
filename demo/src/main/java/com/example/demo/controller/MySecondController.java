package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondController {
    @RequestMapping("/city")
    public String getCity(){
        return "Paris";
    }
}
