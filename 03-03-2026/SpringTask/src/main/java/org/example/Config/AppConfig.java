package org.example.Config;

import org.example.BeanLifeCycle;
import org.example.Repository.UserRepository;
import org.example.Service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {
//    @Bean
//    public UserRepository userRepository(){
//        return new UserRepository();
//    }
//
//    @Bean
//    public UserService userService(){
//        return new UserService(userRepository());
//    }
//
//    @Bean
//    public BeanLifeCycle lifecycleBean(){
//        return new BeanLifeCycle();
//    }
}

