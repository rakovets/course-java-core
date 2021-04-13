package com.rakovets.course.java.core.practice.oop.principles.Cats;

public class Sphynx extends Cat{
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        String meow = "MeOw";
        return meow;
    }

    @Override
    public String purr() {
        String phur = "PhUr";
        return phur;
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(21);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(-21);
    }
}
