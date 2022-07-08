package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    Sphynx(String name) {
        super(name);
    }
    @Override
    public String mew(Person user) {
        user.changeHappiness(-25);
        return getName() + mew();
    }
    @Override
    public String mew() {
        return "miw-miw";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(+15);
        return getName() + purr();
    }
    @Override
    public String purr() {
        return "mur-mur";
    }
}
