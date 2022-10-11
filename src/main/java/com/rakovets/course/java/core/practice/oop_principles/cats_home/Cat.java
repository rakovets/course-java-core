package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "meow-meow";
    }

    public String mew(Person user) {
        int catEffect = -50;
        user.changeHappiness(catEffect);
        return mew();
    }

    public String purr() {
        return "purr";
    }

    public String purr(Person user) {
        int catEffect = 50;
        user.changeHappiness(catEffect);
        return purr();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
