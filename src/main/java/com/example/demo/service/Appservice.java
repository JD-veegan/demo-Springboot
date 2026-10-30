package com.example.demo.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Appservice {
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appversion;

    public Map<String, String> getAppInfo(){
        return Map.of(
                "name",appName,
                "version",appversion
        );
    }

}
