package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "miau-miau";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-30);
    }

    @Override
    public String purr() {
        return "muurr-muurr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(30);
    }
}
