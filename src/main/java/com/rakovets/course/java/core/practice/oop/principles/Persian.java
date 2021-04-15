package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "miau";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-10);
    }

    @Override
    public String purr() {
        return "rrr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(40);
    }
}
