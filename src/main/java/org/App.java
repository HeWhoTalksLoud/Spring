package org;

import org.example.classes.Car;
import org.example.classes.Config;
import org.example.classes.Moto;
import org.example.classes.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Moto moto = context.getBean("moto", Moto.class);
        moto.go();

        System.out.println();

        Person person = context.getBean("person", Person.class);
        person.getInTransport();

        Moto moto2 = context.getBean("moto", Moto.class);

        Car car = context.getBean("car", Car.class);
        Car car2 = context.getBean("car", Car.class);

        System.out.println(moto);
        System.out.println(moto2);
        System.out.println(car);
        System.out.println(car2);

        context.close();
        System.out.println();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Person person2 = ctx.getBean("person", Person.class);

        person2.getInTransport();

        ctx.close();

    }
}
