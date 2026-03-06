package org.example;

import org.example.Config.AppConfig;
import org.example.Controller.UserController;
import org.example.Service.GreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserController controller = context.getBean(UserController.class);

        controller.showMessage();

//        GreetingService greetingService = context.getBean(GreetingService.class);
//        System.out.println(greetingService.greet());
    }
}
