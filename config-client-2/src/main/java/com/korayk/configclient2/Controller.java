package com.korayk.configclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class Controller {

    @Value("${configA_2}")
    private String configA_2;

    @Value("${configB_2}")
    private String configB_2;

    @GetMapping("/configs")
    public Map<String,Object> getConfigs(){
        return Map.of("configA-2",configA_2,"configB-2",configB_2);
    }
}
