package com.rakovets.course.java.core.practice.oop.principles.cats;

public class Persian extends Cat {

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "maaw";
    }

    @Override
    public void mew(Person user) {
        user.changeHappiness(-5);
    }

    @Override
    public String purr() {
        return "trrrtrrr";
    }

    @Override
    public void purr(Person user) {
        user.changeHappiness(39);
    }
}
