package com.rakovets.course.java.core.practice.oop.principles;

public class Cat {
    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    public String catSayMew() {
        return "meow";
    }

    public String catPurr() {
        return "muurrr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void catSayMew(Person person) {
        person.changeHappiness(-10);
    }

    public void catPurr(Person person) {
        person.changeHappiness(15);
    }
}
