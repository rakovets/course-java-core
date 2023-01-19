package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meeew-meeew-meeew";
    }

    @Override
    public String mew(Person user) {
        int debuff = -5;
        user.changeHappiness(debuff);
        return "meeew-meeew-meeew";
    }

    @Override
    public String purr() {
        return "purr-puuuurr-purr";
    }

    @Override
    public String purr(Person user) {
        int buff = 2;
        user.changeHappiness(buff);
        return "purr-puuuurr-purr";
    }
}
