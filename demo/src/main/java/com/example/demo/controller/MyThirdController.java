package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyThirdController {
    @RequestMapping("/jd")
    public String getJobDiscription(){
        return "Java Full Stack developer";
    }

    @RequestMapping("/jd/state")
    public String getstate(){
        return "Maharashtra";
    }
}
