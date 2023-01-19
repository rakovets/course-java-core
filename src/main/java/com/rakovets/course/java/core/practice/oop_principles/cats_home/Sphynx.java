package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew-mew-mew";
    }

    @Override
    public String mew(Person user) {
        int debuff = -3;
        user.changeHappiness(debuff);
        return "Mew-mew-mew";
    }

    @Override
    public String purr() {
        return "Pur-pur-pur";
    }

    @Override
    public String purr(Person user) {
        int buff = 3;
        user.changeHappiness(buff);
        return "Pur-pur-pur";
    }
}
