package com.rakovets.course.challenge.classes;

public class Sphynx extends Cat {
    final double DEFAULT_HAPPINESS_FOR_SPHYNX = 20;

    Sphynx(String name) {
        super(name);
    }

    void mew(Person men) {
        System.out.println("meeeew, btw i am Sphynx");
        men.takeHappiness(-DEFAULT_HAPPINESS_FOR_SPHYNX);
    }

    void purr(Person men) {
        System.out.println("prrrrrr, btw i am Sphynx.");
        men.takeHappiness(DEFAULT_HAPPINESS_FOR_SPHYNX);
    }

    void mew() {
        System.out.println("meeeew, btw i am Sphynx");
    }

    void purr() {
        System.out.println("prrrrrr, btw i am Sphynx.");
    }
}
