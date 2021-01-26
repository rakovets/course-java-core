package com.rakovets.course.java.core.practice.oop.principles.сats_home;

public class Sphynx extends Cat {

    public Sphynx (String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mr-meoooow";
    }

    @Override
    public String purr() {
        return "purr-prrrr";
    }

    @Override
    public void mew(Person random) {
        random.changeHappiness(-10.0);
    }

    @Override
    public void purr(Person random) {
        random.changeHappiness(+10.0);
    }
}
