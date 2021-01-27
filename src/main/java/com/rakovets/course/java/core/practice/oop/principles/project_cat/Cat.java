package com.rakovets.course.java.core.practice.oop.principles.project_cat;

public class Cat {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew-mew";
    }

    public void mew(Person person) {
        person.changeHappiness(-5);
    }

    public String purr() {
        return "purr";
    }

    public void purr(Person person) {
        person.changeHappiness(+5);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
