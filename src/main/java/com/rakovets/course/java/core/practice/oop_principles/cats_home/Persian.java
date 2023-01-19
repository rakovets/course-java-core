package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "meeeeew";
    }

    public String mew(Person user) {
        int debuff = -4;
        user.changeHappiness(debuff);
        return "meeeeew";
    }

    @Override
    public String purr() {
        return "puuuur";
    }

    @Override
    public String purr(Person user) {
        int buff = 5;
        user.changeHappiness(buff);
        return "puuuur";
    }
}
