package com.rakovets.course.java.core.practice.oop_principles.cats;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Meow like default cat";
    }

    public void mew(Person p) {
        p.changeHappiness(-10);
    }

    public String purr() {
        return "Purr like default cat";
    }

    public void purr(Person p) {
        p.changeHappiness(10);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
