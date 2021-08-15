package com.microservices.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FailBackController {

    @GetMapping("/userServiceFailBack")
    public String UserServiceFailBackMethod(){
        return "User service is taking longer than expected." +
                "Please try again shortly";
    }


    @GetMapping("/departmentServiceFailBack")
    public String departmentServiceFailBackMethod(){
        return "Department service is taking longer than expected." +
                "Please try again shortly";
    }
}
