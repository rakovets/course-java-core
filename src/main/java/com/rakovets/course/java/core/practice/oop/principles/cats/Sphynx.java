package com.rakovets.course.java.core.practice.oop.principles.cats;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meww-meww-meww";
    }

    @Override
    public void mew(Person user) {
        user.changeHappiness(-20);
    }

    @Override
    public String purr() {
        return "rrrrrrrrrrrrr";
    }

    @Override
    public void purr(Person user) {
        user.changeHappiness(22);
    }
}
