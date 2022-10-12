package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }
    public String mew() {
        return "mew-mew-mew-mew";
    }
    public String mew(Person owner) {
        owner.changeHappiness(-40);
        return "mew-meeew";
    }
    public String purr() {
        return "purr-purr-purr-purr";
    }
    public String purr(Person owner) {
        owner.changeHappiness(40);
        return "purr-puuurr";
    }
}
