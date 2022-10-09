package com.rakovets.course.java.core.practice.oop_principles;


public class Cat {
    private String name;
    public Person user;

    public Cat(String name) {
        this.name = name;
    }

    public int mew(Person user) {
        user.percentHappiness = -user.percentHappiness;
        return user.changeHappiness(user.percentHappiness);
    }

    public int purr(Person user) {
        user.percentHappiness = user.percentHappiness;
        return user.changeHappiness(user.percentHappiness);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

