package com.rakovets.course.java.core.practice.oop_principles;

public class Sphynx extends Cat {
    final String SPHYNX_MEW_SOUNDS = "mjauSphynx";
    final String SPHYNX_PURR_SOUNDS = "murrSphynx";
    final int CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_SPHYNX_MEWS_ON_PERSON = -4;
    final int CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_SPHYNX_PURRS_ON_PERSON = 4;
    Sphynx(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return SPHYNX_MEW_SOUNDS;
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_SPHYNX_MEWS_ON_PERSON);
    }

    @Override
    public String purr() {
        return SPHYNX_PURR_SOUNDS;
    }

    @Override
    public void purr (Person person) {
        person.changeHappiness(CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_SPHYNX_PURRS_ON_PERSON);
    }
}
