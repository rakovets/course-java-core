package com.rakovets.course.java.core.practice.oop.principles;

public class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    public String mew() {
        return "meow";
    }

    public String purr() {
        return "mr";
    }

    public void mew(Person user) {
        user.changeHappiness(-20);
        mew();
    }

    public void purr(Person user) {
        user.changeHappiness(20);
        purr();
    }
}
