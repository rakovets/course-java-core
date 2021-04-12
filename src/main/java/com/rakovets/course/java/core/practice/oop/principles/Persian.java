package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Persian May!";
    }

    @Override
    public String purr() {
        return "Persian Myp!";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-1);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+1);
    }
}
