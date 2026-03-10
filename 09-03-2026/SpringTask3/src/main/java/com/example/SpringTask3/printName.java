package com.example.SpringTask3;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class printName {
    @Value("${name}")
    private String Name;

    @PostConstruct
    public void displayName(){
        System.out.println("My name is "+Name);
    }
}
