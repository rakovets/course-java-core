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

    public void mew(Person person) {
        person.takeHappiness(-20);
    }

    public void purr(Person person) {
        person.takeHappiness(+30);
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }
}
