package com.rakovets.course.java.core.practice.oop_principles;

public class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    public void mew() { System.out.println("mjau"); }

    public void mew(Person person) {
        person.changeHappiness(-1);
        this.mew();
    }

    public void purr() {
        System.out.println("murr");
    }

    public void purr(Person person) {
        person.changeHappiness(1);
        this.purr();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
