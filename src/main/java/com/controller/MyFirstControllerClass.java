package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MyFirstControllerClass {

    @GetMapping("/get-html-site")
    public String getMyFirstHtml(){
        return "test";
    }
@GetMapping("get-html-image")
    public String getSecondHtml(){
        return "helloworld";
    }
}
