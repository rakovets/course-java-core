package com.rakovets.course.java.core.practice.oop.principles.сats_home;

public class Siamese extends Cat {

    public Siamese (String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew-mew";
    }

    @Override
    public String purr() {
        return "purr-purr";
    }

    @Override
    public void mew(Person random) {
        random.changeHappiness(-30.0);
    }

    @Override
    public void purr(Person random) {
        random.changeHappiness(+30.0);
    }
}
