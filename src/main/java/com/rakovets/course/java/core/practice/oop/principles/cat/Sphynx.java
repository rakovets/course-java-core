package com.rakovets.course.java.core.practice.oop.principles.cat;

public class Sphynx extends Cat{
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew-mew-mew-mew";
    }

    @Override
    public String purr() {
        return "Purr-purr-purr-purr";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-30);
        return "Mew-mew-mew-mew";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(30);
        return "Purr-purr-purr-purr";
    }
}
