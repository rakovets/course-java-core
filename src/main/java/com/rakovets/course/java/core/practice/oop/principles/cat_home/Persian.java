package com.rakovets.course.java.core.practice.oop.principles.cat_home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "me - o - w";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-30);
        mew();
    }

    @Override
    public String purr() {
        return "murrrr - muuuur";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(40);
        purr();
    }
}
