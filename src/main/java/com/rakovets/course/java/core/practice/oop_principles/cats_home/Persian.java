package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meoooow, meoooow!";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-11);

        return "Meoooow, meoooow!";
    }

    @Override
    public String purr() {
        return "Murrr...murrr...";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(12);

        return "Murrr...murrr...";
    }
}
