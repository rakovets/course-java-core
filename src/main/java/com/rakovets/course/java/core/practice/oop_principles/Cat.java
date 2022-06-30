package com.rakovets.course.java.core.practice.oop_principles;

public class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "meow-meow-meow";
    }

    public void mew(Person person) {
        person.changeHappiness(-3);
    }

    public String purr() {
        return "purr-purr-purr";
    }

    public void purr(Person person) {
        person.changeHappiness(5);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
