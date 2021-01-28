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
        person.changeHappiness(-10.0);
    }

    public String purr() {
        return "purr";
    }

    public void purr(Person person) {
        person.changeHappiness(+10.0);
    }

    public String getName() {
        return name;
}

    public void setName(String name) {
        this.name = name;
    }
}
