package org.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    private A a;

//    public B(A a){
//        this.a = a;
//    }
    @Autowired
    public void setA(A a){
        this.a = a;
    }
}
