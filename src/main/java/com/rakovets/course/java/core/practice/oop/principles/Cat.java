package com.rakovets.course.java.core.practice.oop.principles;

public class Cat {
    private String name;

    public Cat (String name){
        this.name = name;
    }

    public String mew() {
        return "meow";
    }
    public String mew(Person user) {
        user.changeHappiness(-10);
        return "Mew";

    public String purr() {
        return "mr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
