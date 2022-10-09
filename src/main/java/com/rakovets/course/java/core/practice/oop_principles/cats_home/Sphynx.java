package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meow-arrr";
    }

    @Override
    public String mew(Person user) {
        int catsEffect = -30;
        user.changeHappiness(catsEffect);
        return mew();
    }

    @Override
    public String purr() {
        return "Purr-arghh";
    }

    @Override
    public String purr(Person user) {
        int catEffect = -30;
        user.changeHappiness(catEffect);
        return purr();
    }
}
