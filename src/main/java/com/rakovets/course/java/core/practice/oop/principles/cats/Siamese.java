package com.rakovets.course.java.core.practice.oop.principles.cats;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meeuw";
    }

    @Override
    public void mew(Person user) {
        user.changeHappiness(-35);
    }

    @Override
    public String purr() {
        return "urrrr";
    }

    @Override
    public void purr(Person user) {
        user.changeHappiness(70);
    }
}
