package com.rakovets.course.challenge.classes;

public class Siamese extends Cat {
    final double DEFAULT_HAPPINESS_FOR_SIAMESE = 25;

    Siamese(String name) {
        super(name);
    }

    void mew(Person men) {
        System.out.println("meeeew, btw i am Siamese");
        men.takeHappiness(-DEFAULT_HAPPINESS_FOR_SIAMESE);
    }

    void purr(Person men) {
        System.out.println("prrrrrr, btw i am Siamese.");
        men.takeHappiness(DEFAULT_HAPPINESS_FOR_SIAMESE);
    }

    void mew() {
        System.out.println("meeeew, btw i am Siamese");
    }

    void purr() {
        System.out.println("prrrrrr, btw i am Siamese.");
    }
}
