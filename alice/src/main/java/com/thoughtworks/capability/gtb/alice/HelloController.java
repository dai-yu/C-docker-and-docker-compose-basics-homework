package com.thoughtworks.capability.gtb.alice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://bob:8081/hello", String.class);
        return result;
    }
}
