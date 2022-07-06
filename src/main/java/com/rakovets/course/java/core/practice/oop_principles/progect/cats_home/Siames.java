package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

public class Siames extends Cat {
    /**
     * Constructor.
     *
     * @param name cat's name.
     */
    public Siames(String name) {
        super(name);
    }

    /**
     * The cat meows.
     *
     * @return text "me-oo-w".
     */
    @Override
    protected String mew() {
        return "me-oo-w";
    }

    /**
     * The cat meows for the character.
     * <p> The character's mood drops.
     *
     * @param user character for which the cat meows.
     * @return text "me-oo-w".
     */
    @Override
    protected String mew(Person user) {
        final double NEGATIVE_PERCENTAGE = -15.0;

        user.changeHappiness(NEGATIVE_PERCENTAGE);
        user.checkDiapason(user.getHappiness());

        return mew();
    }

    /**
     * The cat purrs.
     *
     * @return text "pr".
     */
    @Override
    protected String prr() {
        return "pr";
    }

    /**
     * The cat purrs for the character.
     * <p>The mood of the character rises.
     *
     * @param user the character to whom the cat purrs.
     * @return text "pr".
     */
    @Override
    protected String prr(Person user) {
        final double POSITIVE_PERCENTAGE = 15.0;

        user.changeHappiness(POSITIVE_PERCENTAGE);
        user.checkDiapason(user.getHappiness());

        return prr();
    }
}
