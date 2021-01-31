package com.rakovets.course.java.core.practice.oop.principles;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    public String mew() {
        return "meow-meow-meow";
    }

    public String purr() {
        return "mr-mr-mr";
    }

    public void mew(Person user) {
        user.changeHappiness(-25);
        mew();
    }

    public void purr(Person user) {
        user.changeHappiness(25);
        purr();
    }
}
