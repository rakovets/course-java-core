package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public String mew(Person user) {
        int debuff = -2;
        user.changeHappiness(debuff);
        return "mew";
    }

    public String purr() {
        return "purr";
    }

    public String purr(Person user) {
        int buff = 5;
        user.changeHappiness(buff);
        return "purr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
