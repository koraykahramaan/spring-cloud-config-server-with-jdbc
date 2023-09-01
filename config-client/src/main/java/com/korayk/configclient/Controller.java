package com.korayk.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class Controller {

    @Value("${configA}")
    private String configA;

    @Value("${configB}")
    private String configB;


    @GetMapping("/configs")
    public Map<String,Object> getConfigs(){
        return Map.of("configA",configA,"configB",configB);
    }
}
