package com.example.demo.controller;


import com.example.demo.service.Appservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/app")
public class App {
    private final Appservice Appservice;

    public App(Appservice appservice){
        this.Appservice=appservice;
    }

    @GetMapping("/info")
    public Map<String,String> getAppinfo(){
        return Appservice.getAppInfo();
    }

}

