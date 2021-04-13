package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meeeeew";
    }

    @Override
    public String purr() {
        return "prrrr";
    }

    @Override
    public int mew(Person person) {
        return person.changeHappiness(-10);
    }

    @Override
    public int purr(Person person) {
        return person.changeHappiness(10);
    }
}
