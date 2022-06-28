package com.rakovets.course.java.core.practice.oop_principles.CatHome;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Meeeeeeeeeew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(-40);
        return mew();
    }

    @Override
    public String purr() {
        return "Puuuuuuuuuurr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(40);
        return purr();
    }

}
