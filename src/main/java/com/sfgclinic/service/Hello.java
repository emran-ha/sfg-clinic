package com.sfgclinic.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Hello implements Greetings{

    @Override
    public String hello() {
        System.out.println("from service ");
        return "Hello";
    }
}
