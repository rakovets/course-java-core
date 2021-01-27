package com.rakovets.course.java.core.practice.oop.principles;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String purr() {
        return "Purr-purr";
    }

    @Override
    public String mew() {
        return "Mew-mew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-25);
        return "Mew-mew";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(25);
        return "Purr-purr";
    }
}

