package com.rakovets.course.java.core.practice.oop_principles;

public class Cat {
    final String CAT_MEW_SOUNDS = "mjau";
    final String CAT_PURR_SOUNDS = "murr";
    final int CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_CAT_MEWS_ON_PERSON = -1;
    final int CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_CAT_PURRS_ON_PERSON = 1;

    private String name;

    Cat(String name) {
        this.name = name;
    }

    public String mew() { return CAT_MEW_SOUNDS; }

    public void mew(Person person) {
        person.changeHappiness(CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_CAT_MEWS_ON_PERSON);
    }

    public String purr() {
        return CAT_PURR_SOUNDS;
    }

    public void purr(Person person) {
        person.changeHappiness(CHANGING_OF_HAPPINESS_IN_PERCENTS_WHEN_CAT_PURRS_ON_PERSON);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
