package com.rakovets.course.java.core.practice.oop_principles.cat_home;

public class Persian extends Cat {
   public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Miw-miw";
    }

    @Override
    public String purr() {
        return "Prr-prr";
    }

    @Override
    public void mew(Person user) {
        user.changeHappiness(-3);
    }

    @Override
    public void purr(Person user) {
        user.changeHappiness(3);
    }
}
