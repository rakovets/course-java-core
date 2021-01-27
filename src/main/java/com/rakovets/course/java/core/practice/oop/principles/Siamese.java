package com.rakovets.course.java.core.practice.oop.principles;

public class Siamese extends Cat {
    public Siamese (String name) {
        super(name);
    }
    @Override
    public String purr() {
        return "Purrrrr";
    }
    @Override
    public String mew() {
        return "Meeeeew";
        }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-35);
        return "Meeeeew";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(35);
        return "Purrrrr";
    }
}

