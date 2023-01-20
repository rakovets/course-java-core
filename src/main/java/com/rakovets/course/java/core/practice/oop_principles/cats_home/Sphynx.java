package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew-mew-mew-mew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-20);
        return "mew-mew-mew-mew";
    }

    @Override
    public String pur() {
        return "pur-pur-pur-pur";
    }

    @Override
    public String pur(Person user) {
        user.changeHappiness(20);
        return "pur-pur-pur-pur";
    }
}
