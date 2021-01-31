package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {

    public Persian(String name) {
        super(name);
    }

    public String mew() {
        return "meow-meow";
    }

    public String purr() {
        return "mr-mr";
    }

    public void mew(Person user) {
        user.changeHappiness(-15);
        mew();
    }

    public void purr(Person user) {
        user.changeHappiness(15);
        purr();
    }
}
