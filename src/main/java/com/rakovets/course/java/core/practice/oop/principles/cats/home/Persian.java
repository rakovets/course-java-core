package com.rakovets.course.java.core.practice.oop.principles.cats.home;

public class Persian extends Cat {

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mewawaw";
    }

    @Override
    public String mew(Person value) {
        value.changeHappiness(- 15.0);
        return "Mewawaw";
    }

    @Override
    public String purr() {
        return "Perrmememe";
    }

    @Override
    public String purr(Person value) {
        value.changeHappiness(33.0);
        return "Prrrrrrr";
    }
}
