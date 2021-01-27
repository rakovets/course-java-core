package com.rakovets.course.java.core.practice.oop.principles.cats.home;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public  String mew() {
        return "Meeeewww";
    }

    public String purr() {
        return "purrrrr";
    }
    public  String mew(Person value) {
        value.changeHappiness(-42.0);
        return "Meeeewww";
    }

    public String purr(Person value) {
        value.changeHappiness(55.0);
        return "purrrrr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
