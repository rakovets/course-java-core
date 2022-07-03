package com.rakovets.course.java.core.practice.oop_principles.CatHome;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name, -50, 50);
    }

    public Siamese(String name, int mewValue, int purrValue) {
        super(name, mewValue, purrValue);
    }

    @Override
    public String mew() {
        return "Mew-shhh-Mew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(mewValue);
        return mew();
    }

    @Override
    public String purr() {
        return "Purr-Purrrrrrr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(purrValue);
        return purr();
    }
}
