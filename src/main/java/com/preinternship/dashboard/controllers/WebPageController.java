package com.preinternship.dashboard.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebPageController {

    @GetMapping("/")
    public String getPage(){
        return "hello";
    }
}
