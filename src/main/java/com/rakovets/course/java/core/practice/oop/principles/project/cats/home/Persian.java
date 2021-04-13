package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "MEW";
    }

    @Override
    public String purr() {
        return "PURR";
    }

    @Override
    public int mew(Person person) {
        return person.changeHappiness(-30);
    }

    public int purr(Person person) {
        return person.changeHappiness(30);
    }
}
