package com.rakovets.course.java.core.practice.oop_principles.CatHome;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    public String mew() {
        return "Mew-Mew-Mew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-30);
        return mew();
    }

    @Override
    public String purr() {
        return "Purr-Purr-Purr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(30);
        return purr();
    }
}
