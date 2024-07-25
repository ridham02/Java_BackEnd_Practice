package com.ridhamarora.Firstspringboot.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")//@RequestMapping(value = "/",method = RequestMethod.GET)
    public String HelloWorld(){
        return "This is my first Response in REST API and Hello";
    }
}
