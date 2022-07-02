package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

public class Persian extends Cat {
    /**
     * @param name cat's name.
     */
    public Persian(String name) {
        super(name);
    }

    /**
     * Сat meows.
     *
     * @return meow text.
     */
    @Override
    public String mew() {
        return "meau";
    }

    /**
     * Сat meows for user and the value of the percentage of happiness for the user changes to negative.
     *
     * @param user person type object.
     */
    @Override
    public void mew(Person user) {
        final double NEGATIVE_PERCENTAGE = -20.0;

        user.changeHappiness(NEGATIVE_PERCENTAGE);
    }

    /**
     * Сat purrs.
     *
     * @return text of the purr.
     */
    @Override
    public String prr() {
        return "purrr";
    }

    /**
     * The cat purrs for the user, and the user's happiness percentage changes to a positive value.
     *
     * @param user person type object.
     */
    @Override
    public void prr(Person user) {
        final double POSITIVE_PERCENTAGE = 20.0;

        user.changeHappiness(POSITIVE_PERCENTAGE);
    }
}
