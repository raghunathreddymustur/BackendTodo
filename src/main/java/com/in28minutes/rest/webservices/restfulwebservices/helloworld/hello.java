package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class hello {

    @GetMapping(path="/hello")
    public HelloWorld helloWorld()
    {
        return new HelloWorld("this is raghu");
        //throw new RuntimeException("Some Error Occured");
    }
    @GetMapping(path="/hello/{name}")
    public HelloWorld helloWorldWithPara(@PathVariable String name)
    {
        return new HelloWorld(name);
    }
    
}
