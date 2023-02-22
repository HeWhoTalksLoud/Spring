package org;

public class Person {
    private  Car car;

    public Person() {

    }

    public Person(Car car) {
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void getInCar() {
        System.out.println("Владелец сел в автомобиль");
        car.go();
    }
}
