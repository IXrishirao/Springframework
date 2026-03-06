package org.example.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet(){
        return "Hello,this is greeting";
    }
}
