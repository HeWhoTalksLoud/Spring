package org.example.classes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Car implements Transport {

    public void go() {
        System.out.println("Автомобиль едет");
    }

    @PostConstruct
    public void init() {
        System.out.println("Car.init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Car.destroy");
    }

}
