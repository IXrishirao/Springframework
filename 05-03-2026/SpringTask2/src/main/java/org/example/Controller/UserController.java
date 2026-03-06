package org.example.Controller;

import org.example.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserController {

    @Autowired
    GreetingService greetingService;

    public  void showMessage(){
        System.out.println(greetingService.greet());
    }
}
