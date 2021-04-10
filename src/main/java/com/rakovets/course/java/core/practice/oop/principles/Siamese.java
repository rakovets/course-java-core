package com.rakovets.course.java.core.practice.oop.principles;

public class Siamese extends Cat {


    Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Мяу-Мяу";
    }

    @Override
    public String purr() {
        return "Мур-Мур";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-5);
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+5);
    }
}
