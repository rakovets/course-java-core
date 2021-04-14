package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.project.cats.home.*;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Dog");


        System.out.printf("%s\n", cat.getName());
        System.out.printf("%s\n", cat.mew());
        System.out.printf("%s\n", cat.purr());
        System.out.printf("%s\n", cat.mew(new Person(-5)));
        System.out.printf("%s\n", cat.purr(new Person(5)));
        cat.setName("Bobby");
        System.out.printf("%s\n", cat.getName());



        Persian persian = new Persian("Persik");

        System.out.printf("%s\n", persian.getName());
        System.out.printf("%s\n", persian.mew());
        System.out.printf("%s\n", persian.purr());
        System.out.printf("%s\n", persian.mew(new Person(-15)));
        System.out.printf("%s\n", persian.purr(new Person(25)));
        persian.setName("Luci");
        System.out.printf("%s\n", persian.getName());


        Siamese siamese = new Siamese("Cat");

        System.out.printf("%s\n", siamese.getName());
        System.out.printf("%s\n", siamese.mew());
        System.out.printf("%s\n", siamese.purr());
        System.out.printf("%s\n", siamese.mew(new Person(-10)));
        System.out.printf("%s\n", siamese.purr(new Person(50)));
        persian.setName("Catt");
        System.out.printf("%s\n", siamese.getName());


        Sphynx sphynx = new Sphynx("Mr");

        System.out.printf("%s\n", sphynx.getName());
        System.out.printf("%s\n", sphynx.mew());
        System.out.printf("%s\n", sphynx.purr());
        System.out.printf("%s\n", sphynx.mew(new Person(-50)));
        System.out.printf("%s\n", sphynx.purr(new Person(20)));
        persian.setName("Mrs");
        System.out.printf("%s\n", sphynx.getName());
    }
}
