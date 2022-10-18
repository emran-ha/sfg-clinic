package com.sfgclinic.service;

import org.springframework.stereotype.Service;

@Service
public class Hi implements Greetings {
    @Override
    public String hello() {
        return "Hi";
    }
}
