package com.example.demoapi.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public String getHelloWorld() {
        logger.info("greeting hello world");
        return "Hello world";
    }
}
