package com.rakovets.course.java.core.practice.oop_principles;

public class Sphynx extends Cat {
    final int HUMAN_EXPOSURE_FACTOR = 2;

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public int mew(Person user){
        return -user.changeHappiness(-10) * HUMAN_EXPOSURE_FACTOR;
    }

    @Override
    public int purr(Person user){
        return user.changeHappiness(10) * HUMAN_EXPOSURE_FACTOR;
    }
}
