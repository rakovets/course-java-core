package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat {
    final int change_happines_siamese_mew=-15;
    final int change_happines_siamese_pur=15;
    final String change_sound_siamese_mew="mew-mew-mew";
    final String change_sound_siamese_pur="pur-pur-pur";
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return change_sound_siamese_mew;
    }

    @Override
    public int mew(Person user) {
        return user.changeHappiness(change_happines_siamese_mew);
    }

    @Override
    public String pur() {
        return change_sound_siamese_pur;
    }

    @Override
    public int pur(Person user) {
        return user.changeHappiness(change_happines_siamese_pur);
    }
}
