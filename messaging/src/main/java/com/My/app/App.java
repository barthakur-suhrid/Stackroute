package com.My.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages = "com.My.app")
public class App 
{

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        App app=context.getBean(App.class);
        app.start();

    }

    @Autowired
    private  GreetingMessageService greetingMessageService;

    public void start(){
        System.out.println(greetingMessageService.greetUser());
    }
}
