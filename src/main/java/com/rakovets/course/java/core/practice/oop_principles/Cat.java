package com.rakovets.course.java.core.practice.oop_principles;

public class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    public void mew() { System.out.println("mjau"); }

    public void purr() {
        System.out.println("murr");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
