package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    public Cat(String nameCat) {
        this.name = nameCat;
    }

    public String mew() {
        return "mew - mew - mew ";
    }

    public void mew(Person user) {
        this.mew();
        user.changeHappiness(-10);
    }

    public String purr() {
        return "purr - purr - purr ";
    }

    public void purr(Person user) {
        this.purr();
        user.changeHappiness(10);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
