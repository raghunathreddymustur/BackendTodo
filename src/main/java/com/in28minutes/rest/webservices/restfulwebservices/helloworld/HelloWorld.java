package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class HelloWorld {
    private String message="";
    HelloWorld(String message)
    {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorld [message=" + message + "]";
    }
    
}
