package com.rakovets.course.java.core.practice.oop.principles.task01;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "MEEEEEEW";
    }

    public void mew(Person person) {
        person.changeHappiness(-15.05);
    }

    public String purr() {
        return "prr";
    }

    public void purr(Person person){
        person.changeHappiness(15.05);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
