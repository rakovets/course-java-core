package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

public class Sphynx extends Cat {
    /**
     * @param name cat's name.
     */
    public Sphynx(String name) {
        super(name);
    }

    /**
     * Сat meows.
     *
     * @return meow text.
     */
    @Override
    public String mew() {
        return "meow";
    }

    /**
     * Сat meows for user and the value of the percentage of happiness for the user changes to negative.
     *
     * @param user person type object.
     * @return meow text.
     */
    @Override
    public String mew(Person user) {
        final double NEGATIVE_PERCENTAGE = -10.0;

        user.changeHappiness(NEGATIVE_PERCENTAGE);

        return "meow";
    }

    /**
     * Сat purrs.
     *
     * @return text of the purr.
     */
    @Override
    public String prr() {
        return "prr-rr-rr";
    }

    /**
     * The cat purrs for the user, and the user's happiness percentage changes to a positive value.
     *
     * @param user person type object.
     * @return text of the purr.
     */
    @Override
    public String prr(Person user) {
        final double POSITIVE_PERCENTAGE = 10.0;

        user.changeHappiness(POSITIVE_PERCENTAGE);

        return "prr-rr-rr";
    }
}
