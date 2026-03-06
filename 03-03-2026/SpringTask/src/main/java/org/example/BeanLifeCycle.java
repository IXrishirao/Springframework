package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycle implements InitializingBean, DisposableBean {
    public BeanLifeCycle(){
        System.out.println("1. Bean Constructor called");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("2. @PostConstruct executed");
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("3. InitializingBean afterPropertiesSet()");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("4. @PreDestroy executed");
    }

    @Override
    public void destroy(){
        System.out.println("5. DisposableBean destroy()");
    }
}
