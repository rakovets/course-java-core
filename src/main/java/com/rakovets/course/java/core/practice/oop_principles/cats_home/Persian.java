package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    Persian(String name) {
        super(name);
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-20);
        return getName() +" mii-mii";
    }
    @Override
    public String mew() {
        return "mii-mii";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(+15);
        return getName() +" rrr-rrr" ;
    }
    @Override
    public String purr() {
        return "rrr-rrr";
    }
}
