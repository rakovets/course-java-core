package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "mew-mew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-10);
        return "mew-mew";
    }

    @Override
    public String pur() {
        return "pur-pur";
    }

    @Override
    public String pur(Person user) {
        user.changeHappiness(10);
        return "pur-pur";
    }
}
