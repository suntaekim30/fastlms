package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {


    @GetMapping("/hello")
    public String index(){
        return "Hello";
    }
}
