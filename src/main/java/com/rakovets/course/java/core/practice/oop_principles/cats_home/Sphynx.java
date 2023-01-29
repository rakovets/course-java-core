package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Sphynx extends Cat {
    final int change_happines_sphynx_mew=-20;
    final int change_happines_sphynx_pur=20;
    final String change_sound_sphynx_mew="mew-mew-mew-mew";
    final String change_sound_sphynx_pur="pur-pur-pur-pur";
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return change_sound_sphynx_mew;
    }

    @Override
    public int mew(Person user) {
        return user.changeHappiness(change_happines_sphynx_mew);
    }

    @Override
    public String pur() {
        return change_sound_sphynx_pur;
    }

    @Override
    public int pur(Person user) {
        return user.changeHappiness(change_happines_sphynx_pur);
    }
}
