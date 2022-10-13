package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Мау";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-15);
    }

    @Override
    public String purr() {
        return "Мурмяу";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+25);
    }
}
