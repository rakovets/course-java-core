package com.rakovets.course.java.core.practice.oop.principles.cats.home;

public class Sphinx extends Cat {

    public Sphinx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "bababoi";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-25);
    }

    @Override
    public String purr() {
        return "mrrr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(10);
    }
}
