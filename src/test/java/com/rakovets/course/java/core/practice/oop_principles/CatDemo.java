package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.cat_home.Cat;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.Person;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.cats.Persian;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.cats.Siamese;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.cats.Sphynx;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("");
        Cat persian = new Persian("unknown");
        Cat sphynx = new Sphynx("unknown");
        Cat siamese = new Siamese("unknown");
        Person hanna = new Person(30);

        cat.setName("Simbochka");
        System.out.println(cat.getName());
        System.out.println(cat.mew());
        System.out.println(cat.purr());
        cat.mew(hanna);
        System.out.println("Hanna happiness " + hanna.getHappiness() + "%");
        cat.purr(hanna);
        System.out.println("Hanna happiness " + hanna.getHappiness() + "%");

        persian.setName("Polly");
        System.out.println(persian.getName());
        System.out.println(persian.mew());
        System.out.println(persian.purr());
        persian.mew(hanna);
        System.out.println("Hanna happiness " + hanna.getHappiness() + "%");
        persian.purr(hanna);
        System.out.println("Hanna happiness " + hanna.getHappiness() + "%");

        sphynx.setName("Dina");
        System.out.println(sphynx.getName());
        System.out.println(sphynx.mew());
        System.out.println(sphynx.purr());
        sphynx.mew(hanna);
        System.out.println("Hanna happiness " + hanna.getHappiness() + "%");
        sphynx.purr(hanna);
        System.out.println("Hanna happiness " + hanna.getHappiness() + "%");

        siamese.setName("Vasya");
        System.out.println(siamese.getName());
        System.out.println(siamese.mew());
        System.out.println(siamese.purr());
        siamese.mew(hanna);
        System.out.println("Hanna happiness " + hanna.getHappiness() + "%");
        siamese.purr(hanna);
        System.out.println("Hanna happiness " + hanna.getHappiness() + "%");

        hanna.setHappiness(50);
        System.out.println(hanna.getHappiness());

        hanna.changeHappiness(5);
        System.out.println(hanna.getHappiness());

        hanna.changeHappiness(-5);
        System.out.println(hanna.getHappiness());
    }
}
