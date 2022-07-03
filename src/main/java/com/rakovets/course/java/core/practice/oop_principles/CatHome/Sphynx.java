package com.rakovets.course.java.core.practice.oop_principles.CatHome;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name, -30, 30);
    }

    public Sphynx(String name, int mewValue, int purrValue) {
        super(name, mewValue, purrValue);
    }

    public String mew() {
        return "Mew-Mew-Mew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(mewValue);
        return mew();
    }

    @Override
    public String purr() {
        return "Purr-Purr-Purr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(purrValue);
        return purr();
    }
}
