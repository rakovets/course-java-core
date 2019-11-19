package com.rakovets.course.challenge.classes;

public class Persian extends Cat {
    final double DEFAULT_HAPPINESS_FOR_PERSIAN = 30;
    Persian(String name) {
        super(name);
    }

    void mew(Person men) {
        System.out.println("meeeew, btw i am Persian");
        men.takeHappiness(-DEFAULT_HAPPINESS_FOR_PERSIAN);
    }

    void purr(Person men) {
        System.out.println("prrrrrr, btw i am Persian.");
        men.takeHappiness(DEFAULT_HAPPINESS_FOR_PERSIAN);
    }
    void mew() {
        System.out.println("meeeew, btw i am Persian");
    }

    void purr() {
        System.out.println("prrrrrr, btw i am Persian.");
    }
}
