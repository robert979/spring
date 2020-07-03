package com.siit.spring.tutorialspoint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("dependencyBean")
@AllArgsConstructor
@Getter
public class BeanWithDependencyHelloWorld {

    @Qualifier("helloSpring")
    private HelloWorld helloWorlds;
}
