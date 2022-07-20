package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.cat_home.Persian;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.Person;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.Siamese;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.Sphynx;

public class CatApplication {
    public static void main(String[] args) {
        Person person = new Person(100);
        Sphynx sphynx = new Sphynx("Irma", 10);
        Persian persian = new Persian("Speed", 5);
        Siamese siamese = new Siamese("Luck", -10);

        sphynx.mew();
        persian.mew();
        siamese.mew();

        sphynx.purr();
        persian.purr();
        siamese.purr();

        sphynx.setName("God");
        persian.setName("Apple");
        siamese.setName("Banana");
        System.out.println(sphynx.getName());
        System.out.println(persian.getName());
        System.out.println(siamese.getName());

        person.setHappiness(150);
        System.out.println(person.getHappiness());
        sphynx.mew(person);
        System.out.println(person.getHappiness());
        persian.purr(person);
        System.out.println(person.getHappiness());
    }
}
