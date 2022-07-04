package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class CatApplication {
    public static void main(String[] args) {
        Person user = new Person(75);
        Persian persian = new Persian("Tom");
        Sphynx sphynx = new Sphynx("Lucky");
        Siamese siamese = new Siamese("Jack");

        System.out.println("User happiness is " + user.getHappiness());
        user.setHappiness(100);
        System.out.println("User happiness is " + user.getHappiness());

        System.out.println(sphynx.mew(user));
        System.out.println("User happiness is " + user.getHappiness());
        System.out.println(sphynx.purr());
        System.out.println(sphynx.purr(user));
        System.out.println("User happiness is " + user.getHappiness());

        System.out.println(siamese.mew(user));
        System.out.println("User happiness is " + user.getHappiness());
        System.out.println(siamese.purr());
        System.out.println(siamese.purr(user));
        System.out.println("User happiness is " + user.getHappiness());

        System.out.println(persian.mew(user));
        System.out.println("User happiness is " + user.getHappiness());
        System.out.println(persian.purr());
        System.out.println(persian.purr(user));
        System.out.println("User happiness is " + user.getHappiness());
        persian.setName("Kimi");
        System.out.println("New name is " + persian.getName());
    }
}
