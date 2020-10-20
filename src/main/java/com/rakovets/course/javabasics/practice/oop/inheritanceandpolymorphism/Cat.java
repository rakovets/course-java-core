package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mau-Mau-MAu";

    }

    public String purr() {
        return "Trrrrrrr-Trrrrrrr";

    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }
}
