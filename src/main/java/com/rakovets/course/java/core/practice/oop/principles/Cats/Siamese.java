package com.rakovets.course.java.core.practice.oop.principles.Cats;

public class Siamese extends Cat{
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        String mew = "meow";
        return mew;
    }

    @Override
    public String purr() {
        String phur = "pur";
        return phur;
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(10);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(-10);
    }
}

