package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public String mew() {
        return "Mew - Mew!";
    }

    public String mew(Person person) {
        person.changeHappiness(-10);
        return "Mew - Mew!";
    }

    public String purr() {
        return "MrrMrrM!";
    }

    public String purr(Person person) {
        person.changeHappiness(+10);
        return "MrrMrrM!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
