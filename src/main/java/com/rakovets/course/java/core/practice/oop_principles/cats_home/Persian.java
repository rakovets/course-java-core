package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Persian: meow-meow-meow";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-15);
        return mew();
    }

    @Override
    public String purr() {
        return "Persian: purr-purr-purr";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(20);
        return purr();
    }
}
