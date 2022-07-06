package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Sphynx: meow-meow-meow";
    }

    @Override
    public String mew(Person person) {
        person.changeHappiness(-10);
        return mew();
    }

    @Override
    public String purr() {
        return "Sphynx: purr-purr-purr";
    }

    @Override
    public String purr(Person person) {
        person.changeHappiness(15);
        return purr();
    }
}
