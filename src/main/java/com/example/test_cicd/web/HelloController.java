package com.example.test_cicd.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/cicd")
    public String cicd(){
        return "hello cicd";
    }

    @RequestMapping("/success")
    public String success(){
        return "hello cicsuccessd";
    }

    @RequestMapping("/info")
    public String info(){
        return "hello ci/cd info ";
    }

}
