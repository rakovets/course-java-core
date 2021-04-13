package com.rakovets.course.java.core.practice.oop.principles.Cats;

public class Persian extends Cat {

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        String mew = "MEOW";
        return mew;
    }

    @Override
    public String purr() {
        String phur = "PHUR";
        return phur;
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(25);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(-25);
    }
}

