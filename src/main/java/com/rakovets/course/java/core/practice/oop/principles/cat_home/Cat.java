package com.rakovets.course.java.core.practice.oop.principles.cat_home;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public void mew(Person person) {
        person.changeHappiness(-10);
        mew();
    }

    public String purr() {
        return "mur";
    }

    public void purr(Person person) {
        person.changeHappiness(10);
        purr();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


