package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Cat {
    public String name;
    public Cat(String name) {
        this.name = name;
    }
    public String mew() {
        return "mew";
    }
    public String mew(Person owner) {
        owner.changeHappiness(-10);
        return "meww";
    }
    public String purr() {
        return "purr";
    }
    public String purr(Person owner) {
        owner.changeHappiness(10);
        return "purrr";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
