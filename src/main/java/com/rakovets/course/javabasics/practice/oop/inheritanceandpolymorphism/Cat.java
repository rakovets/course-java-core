package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "Mau-Mau-Mau";
    }

       public String purr() {
        return "Trrrrrrr-Trrrrrrr";
    }

    public void mew(Person person) {
        person.changeHappiness(-12);
    }

    public void purr(Person person) {
        person.changeHappiness(10);
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }
}
