package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Sphynx extends Cat {
    public Sphynx(String name, double givenHappinese) {
        super(name, givenHappinese);
    }

    @Override
    public void mew() {
        System.out.println("MEEEW");
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(getGivenHappinese());
    }

    @Override
    public void purr() {
        System.out.println("PUURR");
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(getGivenHappinese());
    }
}
