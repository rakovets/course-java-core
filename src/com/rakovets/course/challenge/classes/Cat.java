package com.rakovets.course.challenge.classes;

public class Cat {
    String name;
    final double DEFAULT_HAPPINESS_FOR_CAT = 15;

    Cat(String name) {
        this.name = name;
    }

    void mew(Person men) {
        System.out.println("meeeew");
        men.takeHappiness(-DEFAULT_HAPPINESS_FOR_CAT);
    }

    void purr(Person men) {
        System.out.println("prrrrrr.");
        men.takeHappiness(DEFAULT_HAPPINESS_FOR_CAT);
    }

    void getName() {
        System.out.println("name: " + name);
    }

    void setName(String name) {
        this.name = name;
    }

    void mew() {
        System.out.println("meeeew");
    }

    void purr() {
        System.out.println("prrrrrr.");
    }
}
