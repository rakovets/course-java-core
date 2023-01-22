package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    public Siamese() {
    }

    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Mew-Mew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-2);
        return "Mew-Mew";
    }

    @Override
    public String purr() {
        return "Purr-Purr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(2);
        return "Purr-Purr";
    }

}
