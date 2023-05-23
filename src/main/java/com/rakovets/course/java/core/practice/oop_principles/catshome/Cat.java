package com.rakovets.course.java.core.practice.oop_principles.catshome;
public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void mew() {
        System.out.println("Meow!");
    }

    public void mew(Person person) {
        person.changeHappiness(-10);
    }

    public void purr() {
        System.out.println("Purr!");
    }

    public void purr(Person person) {
        person.changeHappiness(10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
