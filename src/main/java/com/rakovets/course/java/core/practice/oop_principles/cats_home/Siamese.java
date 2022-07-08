package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    Siamese(String name) {
        super(name);
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-28);
        return getName() + mew();
    }
    @Override
    public String mew() {
        return "miaow-miaow";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(+7);
        return getName() + purr();
    }
    @Override
    public String purr() {
        return "pr-pr";
    }
}
