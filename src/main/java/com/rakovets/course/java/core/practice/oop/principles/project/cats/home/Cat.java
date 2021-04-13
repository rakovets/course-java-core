package com.rakovets.course.java.core.practice.oop.principles.project.cats.home;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public int mew(Person person) {
        return person.changeHappiness(-20);
    }

    public String purr() {
        return "purr";
    }

    public int purr(Person person) {
        return person.changeHappiness(20);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

