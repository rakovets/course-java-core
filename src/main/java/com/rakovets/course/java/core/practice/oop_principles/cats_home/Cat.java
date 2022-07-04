package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    Cat(String name){
        this.name = name;
    }

    public String mew(Person user) {
        user.changeHappiness(-1);
        return "mew";
    }

    public String purr(Person user) {
        user.changeHappiness(+1);
        return "purr";
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
