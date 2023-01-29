package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    final int change_happines_persian_mew = -10;
    final int change_happines_persian_pur = 10;
    final String change_sound_persian_mew = "mew-mew";
    final String change_sound_persian_pur = "pur-pur";

    public Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return change_sound_persian_mew;
    }

    @Override
    public int mew(Person user) {
        return user.changeHappiness(change_happines_persian_mew);
    }

    @Override
    public String pur() {
        return change_sound_persian_pur;
    }

    @Override
    public int pur(Person user) {
        return user.changeHappiness(change_happines_persian_pur);
    }
}
