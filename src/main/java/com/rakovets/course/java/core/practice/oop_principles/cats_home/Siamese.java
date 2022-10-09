package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mrr-meooow";
    }

    @Override
    public String mew(Person user) {
        int catsEffect = 40;
        user.changeHappiness(catsEffect);
        return mew();
    }

    @Override
    public String purr() {
        return "Purrr-purrr";
    }

    @Override
    public String purr(Person user) {
        int catEffect = 40;
        user.changeHappiness(catEffect);
        return purr();
    }
}
