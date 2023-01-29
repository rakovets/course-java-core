package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Cat {
    private String name;
    final int change_happines_cat_mew = -5;
    final int change_happines_cat_pur=5;
    final String change_sound_cat_mew = "mew";
    final String change_sound_cat_pur = "pur";

    public Cat(String name) {
        this.name = name;
    }

    public String mew() {
        return change_sound_cat_mew;
    }

    public int mew(Person user) {
        return user.changeHappiness(change_happines_cat_mew);
    }

    public String pur() {
        return change_sound_cat_pur;
    }

    public int pur(Person user) {
        return user.changeHappiness(change_happines_cat_pur);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
