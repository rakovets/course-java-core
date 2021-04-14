package com.rakovets.course.java.core.practice.oop.principles;
import com.rakovets.course.java.core.practice.oop.principles.project.cats.home.*;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person(100);
        System.out.printf("%d\n", person.getHappiness());
        person.setHappiness(10);
        System.out.printf("%d\n", person.getHappiness());
        System.out.printf("%d\n", person.changeHappiness(-10));
        System.out.printf("%d\n", person.changeHappiness(-10));
    }
}
