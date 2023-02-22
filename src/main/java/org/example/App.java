package org.example;

import org.Car;
import org.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");



        Person person = context.getBean("person", Person.class);

        person.getInCar();

        Car car1 = context.getBean("car", Car.class);
        Car car2 = context.getBean("car", Car.class);

        System.out.println(car1);
        System.out.println(car2);

        context.close();


        System.out.println();
        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person2 = context2.getBean("person", Person.class);

        person2.getInCar();

        Car car3 = context2.getBean("car", Car.class);
        Car car4 = context2.getBean("car", Car.class);

        System.out.println(car3);
        System.out.println(car4);

        context2.close();


    }
}
