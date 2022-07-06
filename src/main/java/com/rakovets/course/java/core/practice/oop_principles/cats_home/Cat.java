package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "meow-meow-meow";
    }

    public String mew(Person person) {
        person.changeHappiness(-3);
        return "meow-Master-meow";
    }

    public String purr() {
        return "purr-purr-purr";
    }

    public String purr(Person person) {
        person.changeHappiness(5);
        return "purr-purr-purr";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
