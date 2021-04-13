package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

import com.rakovets.course.java.core.practice.oop.principles.project.cats.home.*;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");

        System.out.printf("%s", cat.getName());
        cat.setName("Bob");
        System.out.printf("\n%s", cat.getName());
        System.out.printf("\n%s", cat.mew());
        System.out.printf("\n%s", cat.purr());
        System.out.printf("\n%d", cat.mew(new Person(50)));
        System.out.printf("\n%d\n", cat.purr(new Person(50)));

        Siamese catSiamese = new Siamese("Cloe");

        System.out.printf("\n%s", catSiamese.getName());
        catSiamese.setName("Ann");
        System.out.printf("\n%s", catSiamese.getName());
        System.out.printf("\n%s", catSiamese.mew());
        System.out.printf("\n%s", catSiamese.purr());
        System.out.printf("\n%d", catSiamese.mew(new Person(50)));
        System.out.printf("\n%d\n", catSiamese.purr(new Person(50)));

        Persian catPersian = new Persian("Ale");
        Person person = new Person(50);

        System.out.printf("\n%s", catPersian.getName());
        catPersian.setName("Leo");
        System.out.printf("\n%s", catPersian.getName());
        System.out.printf("\n%s", catPersian.mew());
        System.out.printf("\n%s", catPersian.purr());
        System.out.printf("\n%d", catPersian.mew(person));
        System.out.printf("\n%d\n", catPersian.purr(person));

        Sphynx catSphynx = new Sphynx("Ali");

        System.out.printf("\n%s", catSphynx.getName());
        catSphynx.setName("Hell");
        System.out.printf("\n%s", catSphynx.getName());
        System.out.printf("\n%s", catSphynx.mew());
        System.out.printf("\n%s", catSphynx.purr());
        System.out.printf("\n%d", catSphynx.mew(person));
        System.out.printf("\n%d\n", catSphynx.purr(person));
    }
}
