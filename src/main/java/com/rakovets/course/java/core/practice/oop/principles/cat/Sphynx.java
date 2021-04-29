package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Sphynx extends Cat {
    private final int PERCENT_HAPPINESS = 55;

    public Sphynx(String nameCate) {
        super(nameCate);
    }

    public void mew() {
        System.out.println("Mi mi");
    }

    public void purr() {
        System.out.println("Grrr Grrr");
    }

    public void mew(Person person) {
        person.changeHappiness(-PERCENT_HAPPINESS);
    }

    public void purr(Person person) {
        person.changeHappiness(PERCENT_HAPPINESS);
    }
}
