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
    public String mew(Person random) {
        random.changeHappiness(-30.0);
        return mew();
    }

    @Override
    public String purr(Person random) {
        random.changeHappiness(+30.0);
        return purr();
    }
}
