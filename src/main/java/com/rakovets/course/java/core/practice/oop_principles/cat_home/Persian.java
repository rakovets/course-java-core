package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Persian extends Cat {
    public Persian(String name, double givenHappinese) {
        super(name, givenHappinese);
    }

    @Override
    public void mew() {
        System.out.println("MeeeW");
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(getGivenHappinese());
    }

    @Override
    public void purr() {
        System.out.println("PuurR");
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(getGivenHappinese());
    }
}
