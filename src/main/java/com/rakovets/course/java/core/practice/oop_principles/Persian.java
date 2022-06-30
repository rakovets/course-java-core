package com.rakovets.course.java.core.practice.oop_principles;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Persian: meow-meow-meow";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-15);
    }

    @Override
    public String purr() {
        return "Persian: purr-purr-purr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(20);
    }
}
