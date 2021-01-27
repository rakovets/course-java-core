package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew Sphynx";
    }

    @Override
    public String purr() {
        return "purr Sphynx";
    }

    @Override
    public void mew(Person person) {
        super.mew(person);
        person.changeHappiness(-10.0);
    }

    @Override
    public void purr(Person person) {
        super.purr(person);
        person.changeHappiness(+10.0);
    }
}
