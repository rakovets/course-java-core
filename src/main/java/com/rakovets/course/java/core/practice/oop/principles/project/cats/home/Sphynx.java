package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "MEEEEEEEEEEEW";
    }

    @Override
    public String purr() {
        return "pr";
    }

    @Override
    public int mew(Person person) {
        return person.changeHappiness(-50);
    }

    @Override
    public int purr(Person person) {
        return person.changeHappiness(50);
    }
}
