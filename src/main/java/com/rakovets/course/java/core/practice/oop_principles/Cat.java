package com.rakovets.course.java.core.practice.oop_principles;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Meow-meow";
    }

    public int mew(Person person) {
        return person.changeHappiness(-1);
    }

    public String purr() {
        return "Purr-purr";
    }

    public int purr(Person person) {
        return person.changeHappiness(1);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
