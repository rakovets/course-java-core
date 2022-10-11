package com.rakovets.course.java.core.practice.oop_principles;


public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public int mew(Person user) {
        return user.changeHappiness(-10);
    }

    public int purr(Person user) {
        return user.changeHappiness(10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
