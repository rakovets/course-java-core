package com.rakovets.course.java.core.practice.oop.principles;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {}

    public String mew() {
       return "mew-mew";
    }

    public double mew(Person person) {
        return person.changeHappiness();
    }

    public String purr() {
       return "purr-purr-purr";
    }

    public double purr(Person person){
        return person.changeHappiness();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

