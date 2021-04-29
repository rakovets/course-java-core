package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Siamese extends Cat {
    private final int PERCENT_HAPPINESS = 30;

    public Siamese(String nameCate) {
        super(nameCate);
    }

    public void mew() {
        System.out.println("Miiiiy miyyy");
    }

    public void purr() {
        System.out.println("Mrrr Mrrr");
    }

    public void mew(Person person) {
        person.changeHappiness(-PERCENT_HAPPINESS);
    }

    public void purr(Person person) {
        person.changeHappiness(PERCENT_HAPPINESS);
    }
}
