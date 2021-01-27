package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew Persian";
    }

    @Override
    public String purr() {
        return "purr Persian";
    }

    @Override
    public void mew(Person person) {
        super.mew(person);
        person.changeHappiness(+20.0);
    }

    @Override
    public void purr(Person person) {
        super.purr(person);
        person.changeHappiness(-20.0);
    }
}
