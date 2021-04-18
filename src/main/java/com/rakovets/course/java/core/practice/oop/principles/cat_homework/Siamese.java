package com.rakovets.course.java.core.practice.oop.principles.cat_homework;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meawww";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-20);
    }

    @Override
    public String purr() {
        return "purrrr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(30);
    }
}
