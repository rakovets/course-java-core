package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public void mew() {
        System.out.println("mEEEEEw");
    }

    @Override
    public void mew(Person person, double happiness) {
        person.changeHappiness(happiness * PERCENT_OF_HAPPINESS);
    }

    @Override
    public void purr() {
        System.out.println("pUUUURr");
    }

    @Override
    public void purr(Person person, double happiness) {
        person.changeHappiness(happiness - PERCENT_OF_HAPPINESS);
    }
}
