package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.cats.Cat;
import com.rakovets.course.java.core.practice.oop.principles.cats.Person;
import com.rakovets.course.java.core.practice.oop.principles.cats.Siamese;

public class CatDemo {
    public static void main(String[] args) {
        Cat name = new Cat("Bars");
        name.setName("Vaska");
        System.out.println(name.mew() + " " + name.purr() + " " + name.getName());
        Siamese nameSiamese = new Siamese("Baks");
        System.out.println(nameSiamese.getName());
        System.out.println(nameSiamese.mew());
        Person user = new Person(100);
        user.changeHappiness(-20);
        System.out.println(user.getHappiness());
    }
}
