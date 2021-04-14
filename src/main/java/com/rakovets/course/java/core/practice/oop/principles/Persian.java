package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {
    public Persian(String name) {
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
    public String mew(Person person) {
        person.changeHappiness(-1);
        return mew();
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(+1);
        return purr();
    }
}
