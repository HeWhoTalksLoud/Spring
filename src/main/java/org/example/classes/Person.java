package org.example.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Transport transport;

    public Person() {

    }

    public Person(Transport transport) {
        this.transport = transport;
    }

    @Autowired
    @Qualifier("moto")
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void getInTransport() {
        System.out.println("Владелец сел в транспорт");
        transport.go();
    }
}
