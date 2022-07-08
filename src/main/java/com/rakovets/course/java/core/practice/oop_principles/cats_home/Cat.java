package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public String mew(Person user) {
        user.changeHappiness(-1);
        return getName() + mew();
    }

    public String purr(Person user) {
        user.changeHappiness(+1);
        return getName() + purr() ;
    }

    public String purr() {
        return "purr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
