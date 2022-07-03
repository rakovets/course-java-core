package com.rakovets.course.java.core.practice.oop_principles.CatHome;

public class Persian extends Cat {

    public Persian(String name) {
        super(name, -40, 40);
    }

    public Persian(String name, int mewValue, int purrValue) {
        super(name, mewValue, purrValue);
    }

    @Override
    public String mew() {
        return "Meeeeeeeeeew";
    }

    @Override
    public String mew(Person user) {
        user.changeHappiness(mewValue);
        return mew();
    }

    @Override
    public String purr() {
        return "Puuuuuuuuuurr";
    }

    @Override
    public String purr(Person user) {
        user.changeHappiness(purrValue);
        return purr();
    }
}
