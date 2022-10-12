package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }
    public String mew() {
        return "mew-mew-mew";
    }
    public String mew(Person owner) {
        owner.changeHappiness(-30);
       return "meeww";
    }
    public String purr() {
        return "purr-purr-purr";
    }
    public String purr(Person owner) {
        owner.changeHappiness(30);
        return "puurrr";
    }
}
