package com.cicd.aws_ec2_cicd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class SimpleController {

    @GetMapping("")
    @ResponseBody
    public String home() {
        return "Hello World!!";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
