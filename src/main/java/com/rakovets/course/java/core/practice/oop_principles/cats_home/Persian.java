package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meeeeow-meeeeeow";
    }

    @Override
    public String mew(Person user) {
        int catsEffect = 50;
        user.changeHappiness(catsEffect);
        return mew();
    }

    @Override
    public String purr() {
        return "Purr-purr-purr";
    }

    @Override
    public String purr(Person user) {
        int catEffect = 70;
        user.changeHappiness(catEffect);
        return purr();
    }
}
