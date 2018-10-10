package com.My.app;

import org.springframework.stereotype.Component;

@Component
public class GreetingMessageServiceImpl implements GreetingMessageService {

    public String greetUser() {
        return "Welcome to Chapter-1 of book Learning Spring Application Development";
    }

}