package com.rakovets.course.java.core.practice.oop_principles.CatHome;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mew";
    }

    public String mew(Person user) {
        user.changeHappiness(-10);
        return mew();
    }

    public String purr() {
        return "Purr";
    }

    public String purr(Person user) {
        user.changeHappiness(10);
        return purr();
    }
}
