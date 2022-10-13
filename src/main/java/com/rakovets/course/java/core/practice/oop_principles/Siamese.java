package com.rakovets.course.java.core.practice.oop_principles;

public class Siamese extends Cat {
    final String SIAMESE_MEW_SOUNDS = "mjauSiamese";
    final String SIAMESE_PURR_SOUNDS = "murrSiamese";
    final int CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_SIAMESE_MEWS_ON_PERSON = -3;
    final int CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_SIAMESE_PURRS_ON_PERSON = 3;
    Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return SIAMESE_MEW_SOUNDS;
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_SIAMESE_MEWS_ON_PERSON);
    }

    @Override
    public String purr() {
        return SIAMESE_PURR_SOUNDS;
    }

    @Override
    public void purr (Person person) {
        person.changeHappiness(CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_SIAMESE_PURRS_ON_PERSON);
    }
}
