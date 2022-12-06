package com.example.productbackend2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @PostMapping("/add")
    public String Productadd(){
        return "product added";
    }
}
