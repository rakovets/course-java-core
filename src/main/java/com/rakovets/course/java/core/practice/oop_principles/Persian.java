package com.rakovets.course.java.core.practice.oop_principles;

public class Persian extends Cat {
    final String PERSIAN_MEW_SOUNDS = "mjauPersian";
    final String PERSIAN_PURR_SOUNDS = "murrPersian";
    final int CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_PERSIAN_MEWS_ON_PERSON = -2;
    final int CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_PERSIAN_PURRS_ON_PERSON = 2;

    Persian(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return PERSIAN_MEW_SOUNDS;
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_PERSIAN_MEWS_ON_PERSON);
    }

    @Override
    public String purr() {
        return PERSIAN_PURR_SOUNDS;
    }

    @Override
    public void purr (Person person) {
        person.changeHappiness(CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_PERSIAN_PURRS_ON_PERSON);
    }
}
