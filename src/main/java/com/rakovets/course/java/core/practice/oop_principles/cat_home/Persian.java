package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }
    public String mew() {
        return "mew-mew";
    }
    public String mew(Person owner) {
        owner.changeHappiness(-20);
        return "mew-meww";
    }
    public String purr() {
        return "purr-pur";
    }
    public String purr(Person owner) {
        owner.changeHappiness(20);
        return "purr-purrr";
    }
}

