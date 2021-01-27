package com.rakovets.course.java.core.practice.oop.principles.cat;

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
    public String mew(Person user) {
        user.changeHappiness(-20);
        return "Mew-mew";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(20);
        return "Purr-purr";
    }
}
