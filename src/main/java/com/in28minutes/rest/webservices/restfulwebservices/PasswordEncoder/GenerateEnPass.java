package com.in28minutes.rest.webservices.restfulwebservices.PasswordEncoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GenerateEnPass {
    public static void main(String[] args)
    {
        BCryptPasswordEncoder bc=new BCryptPasswordEncoder();
        System.out.println(bc.encode("raghu"));
    }
}
