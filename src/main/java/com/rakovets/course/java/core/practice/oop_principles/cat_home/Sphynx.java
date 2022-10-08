package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew-mew-miw";
    }

    @Override
    public String purr() {
        return "Purr-purr-prr";
    }

    @Override
    public void mew(Person user) {
        user.changeHappiness(-4);
    }

    @Override
    public void purr(Person user) {
        user.changeHappiness(4);
    }

}
