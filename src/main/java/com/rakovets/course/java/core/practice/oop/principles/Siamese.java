package com.rakovets.course.java.core.practice.oop.principles;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meaww";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-40);
    }

    @Override
    public String purr() {
        return "muurr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(80);
    }
}
