package com.rakovets.course.java.core.practice.oop.principles.cats.home;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meow";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-10);
    }

    @Override
    public String purr() {
        return "phrrr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(10);
    }
}
