package com;

import com.siit.spring.tutorialspoint.BeanWithDependencyHelloWorld;
import com.siit.spring.tutorialspoint.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {


    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        String beanutza = (String)applicationContext.getBean("mySampleBean");
        System.out.println("beanutza -->" + beanutza);

        BeanWithDependencyHelloWorld bean = applicationContext.getBean(BeanWithDependencyHelloWorld.class);
        //bean.getHelloWorld().sayHello();



    }

    public static void main(String[] args) {
       SpringApplication.run(Application.class,args);

    }
}
