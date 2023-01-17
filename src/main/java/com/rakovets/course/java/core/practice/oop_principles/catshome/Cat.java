package com.rakovets.course.java.core.practice.oop_principles.catshome;

public class Cat {
    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mew, mew, mew!";
    }

    public String purr() {
        return "Purr...";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
