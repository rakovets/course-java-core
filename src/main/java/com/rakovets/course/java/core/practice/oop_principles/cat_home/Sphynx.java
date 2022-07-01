package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public void mew() {
        System.out.println("MEEEW");
    }

    @Override
    public void mew(Person person, double happiness) {
        person.changeHappiness(happiness + PERCENT_OF_HAPPINESS);
    }

    @Override
    public void purr() {
        System.out.println("PUURR");
    }

    @Override
    public void purr(Person person, double happiness) {
        person.changeHappiness(happiness / PERCENT_OF_HAPPINESS);
    }
}
