package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Persian extends Cat {
    private final int PERCENT_HAPPINESS = 20;

    public Persian(String nameCate) {
        super(nameCate);
    }

    public void mew() {
        System.out.println("Miiiiiy miay");
    }

    public void purr() {
        System.out.println("Mrruu Mrruu");
    }

    public void mew(Person person) {
        person.changeHappiness(-PERCENT_HAPPINESS);
    }

    public void purr(Person person) {
        person.changeHappiness(PERCENT_HAPPINESS);
    }
}
