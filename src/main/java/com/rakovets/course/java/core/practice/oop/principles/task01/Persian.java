package com.rakovets.course.java.core.practice.oop.principles.task01;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew-mew-mew-mew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-4.5);
    }

    @Override
    public String purr() {
        return "prr-prr-prr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(15.5);
    }
}
