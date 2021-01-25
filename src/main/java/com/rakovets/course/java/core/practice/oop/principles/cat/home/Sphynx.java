package com.rakovets.course.java.core.practice.oop.principles.cat.home;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Sphynx mew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-50.0);
    }

    @Override
    public String purr() {
        return "Sphynx purr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+50.0);
    }
}
