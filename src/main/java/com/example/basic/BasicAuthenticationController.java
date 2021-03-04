package com.example.basic;

import com.example.demo.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BasicAuthenticationController {


    @GetMapping("/basicauth")
    public AuthenticationBean helloBean(){
        return new AuthenticationBean("You are authenticated");
    }



}
