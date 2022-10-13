package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Persian extends Cat {
    final int HUMAN_EXPOSURE_FACTOR = 2;

    public Persian(String name) {
        super(name);
    }

    @Override
    public int mew(Person user){
        return user.changeHappiness(-10) * HUMAN_EXPOSURE_FACTOR;
    }

    @Override
    public int purr(Person user){
        return user.changeHappiness(10) * HUMAN_EXPOSURE_FACTOR;
    }
}
