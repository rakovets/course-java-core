package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew-mew";
    }

    @Override
    public String purr() {
        return "Purr-purr";
    }

    @Override
    public void mew(Person user) {
        user.changeHappiness(-2);
    }

    @Override
    public void purr(Person user) {
        user.changeHappiness(2);
    }
}
