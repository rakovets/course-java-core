package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew mew mew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-50.0);
    }

    @Override
    public String purr() {
        return "purrrrrrrr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+50.0);
    }
}
