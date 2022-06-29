package com.rakovets.course.java.core.practice.oop_principles;

public class CatApp {
    public static void main(String[] args) {

        Cat tom = new Cat("tom");
        Person joe = new Person(80);

        Cat jerry = new Persian("jerry");

        tom.mew(joe);
        System.out.println(joe.getHappiness());

        tom.purr(joe);
        System.out.println(joe.getHappiness());

        jerry.purr(joe);
        System.out.println(joe.getHappiness());


    }
}
