package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meow meow meow";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-25.0);
    }

    @Override
    public String purr() {
        return "purrrrpurrrr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+25.0);
    }
}
