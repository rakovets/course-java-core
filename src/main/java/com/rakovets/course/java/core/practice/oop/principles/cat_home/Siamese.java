package com.rakovets.course.java.core.practice.oop.principles.cat_home;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Siamese mew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(-15.0);
    }

    @Override
    public String purr() {
        return "Siamese purr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+15.0);
    }
}
