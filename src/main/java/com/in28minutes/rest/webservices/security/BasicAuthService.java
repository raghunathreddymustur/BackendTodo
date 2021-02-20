package com.in28minutes.rest.webservices.security;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthService {
    
    @GetMapping(path="/basicAuth")
    public BasicAuth basicAuth()
    {
        return new BasicAuth("You Are Authenticated");
    }
}
