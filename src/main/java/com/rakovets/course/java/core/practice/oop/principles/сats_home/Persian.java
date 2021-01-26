package com.rakovets.course.java.core.practice.oop.principles.сats_home;

public class Persian extends Cat {

    public Persian (String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew-mew-mew";
    }

    @Override
    public String purr() {
        return "purr-purr-purr";
    }

    @Override
    public void mew(Person random) {
        random.changeHappiness(-15.0);
    }

    @Override
    public void purr(Person random) {
        random.changeHappiness(+15.0);
    }
}
