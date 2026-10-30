package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FirstRestExample {
@GetMapping("/hello")
    public ResponseEntity<String> getAll(){
    return ResponseEntity.ok("Hello this is luck");
}

@RequestMapping("/hello-first")
    public Map<String, String> callMethod(){
    Map<String, String>map = new HashMap<>();
    map.put("Message", "Hello");
    map.put("Message1", "Keerthiyan");
    return map;
    }
}
