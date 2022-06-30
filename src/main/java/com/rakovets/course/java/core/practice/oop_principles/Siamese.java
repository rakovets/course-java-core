package com.rakovets.course.java.core.practice.oop_principles;

public class Siamese extends Cat {
    Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Siamese: meow-meow-meow";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-5);
    }

    @Override
    public String purr() {
        return "Siamese: purr-purr-purr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(10);
    }
}
