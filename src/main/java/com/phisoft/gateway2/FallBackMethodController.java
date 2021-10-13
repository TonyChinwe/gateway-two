package com.phisoft.gateway2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/user-service-fallback")
    public String userServiceFallBack(){
        return "User service is longer than expected" +
                "please try again later";
    }

    @PostMapping("/user-service-fallback")
    public String userServiceFallBackPost(){
        return "User service is longer than expected" +
                "please try again later";
    }

    @GetMapping("/depart-service-fallback")
    public String departServiceFallBack(){
        return "Department service is longer than expected" +
                "please try again later";
    }

    @PostMapping("/depart-service-fallback")
    public String departServiceFallBackPost(){
        return "Department service is longer than expected" +
                "please try again later";
    }
}
