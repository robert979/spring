package com.siit.spring.tutorialspoint;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public void sayHello(){
        System.out.println("Say hello from a bean");
    }
}
