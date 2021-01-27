package com.rakovets.course.java.core.practice.oop.principles;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew Siamese";
    }

    @Override
    public String purr() {
        return "purr Siamese";
    }

    @Override
    public void mew(Person person) {
        super.mew(person);
        person.changeHappiness(-5.0);
    }

    @Override
    public void purr(Person person) {
        super.purr(person);
        person.changeHappiness(+5.0);
    }
}
