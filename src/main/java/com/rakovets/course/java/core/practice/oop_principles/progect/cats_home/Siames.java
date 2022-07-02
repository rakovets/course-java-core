package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

public class Siames extends Cat {
    /**
     * @param name cat's name.
     */
    public Siames(String name) {
        super(name);
    }

    /**
     * Сat meows.
     *
     * @return meow text.
     */
    @Override
    public String mew() {
        return "me-oo-w";
    }

    /**
     * Сat meows for user and the value of the percentage of happiness for the user changes to negative.
     *
     * @param user person type object.
     */
    @Override
    public void mew(Person user) {
        final double NEGATIVE_PERCENTAGE = -15.0;

        user.changeHappiness(NEGATIVE_PERCENTAGE);
    }

    /**
     * Сat purrs.
     *
     * @return text of the purr.
     */
    @Override
    public String prr() {
        return "pr";
    }

    /**
     * The cat purrs for the user, and the user's happiness percentage changes to a positive value.
     *
     * @param user person type object.
     */
    @Override
    public void prr(Person user) {
        final double POSITIVE_PERCENTAGE = 15.0;

        user.changeHappiness(POSITIVE_PERCENTAGE);
    }
}
