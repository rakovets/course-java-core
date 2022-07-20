package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Siamese extends Cat {
    public Siamese(String name, double givenHappinese) {
        super(name, givenHappinese);
    }

    @Override
    public void mew() {
        System.out.println("mEEEEEw");
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(getGivenHappinese());
    }

    @Override
    public void purr() {
        System.out.println("pUUUURr");
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(getGivenHappinese());
    }
}
