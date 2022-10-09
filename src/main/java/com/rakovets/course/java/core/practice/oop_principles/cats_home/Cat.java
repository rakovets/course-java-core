package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mew";
    }

    public void mew(Person person) {
        person.changeHappiness(+10);
    }
    public String purr() {
        return "Prrr";
    }

    public void purr(Person person) {
        person.changeHappiness(+20);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

