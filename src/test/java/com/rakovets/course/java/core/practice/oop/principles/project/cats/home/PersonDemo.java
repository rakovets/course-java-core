package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

import com.rakovets.course.java.core.practice.oop.principles.project.cats.home.Person;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person(100);
        System.out.printf("\n%d", person.getHappiness());
        person.setHappiness(80);
        System.out.printf("\n%d", person.getHappiness());
        System.out.printf("\n%d", person.changeHappiness(10));
        System.out.printf("\n%d\n", person.changeHappiness(-20));
    }
}
