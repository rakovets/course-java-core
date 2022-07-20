package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

public class Persian extends Cat {
    private static final String MEW = "meau";
    private static final String PRR = "purrr";

    /**
     * Constructor.
     *
     * @param name cat's name.
     */
    public Persian(String name) {
        super(name);
    }

    /**
     * The cat meows.
     *
     * @return text "meau".
     */
    @Override
    protected String mew() {
        return MEW;
    }

    /**
     * The cat meows for the character.
     * <p> The character's mood drops.
     *
     * @param user character for which the cat meows.
     * @return text "meau".
     */
    @Override
    protected String mew(Person user) {
        double negativePercentage = -20.0;

        user.changeHappiness(negativePercentage);
        user.checkDiapason(user.getHappiness());

        return mew();
    }

    /**
     * The cat purrs.
     *
     * @return text "purrr".
     */
    @Override
    protected String prr() {
        return PRR;
    }

    /**
     * The cat purrs for the character.
     * <p>The mood of the character rises.
     *
     * @param user the character to whom the cat purrs.
     * @return text "purrr".
     */
    @Override
    protected String prr(Person user) {
        double positivePercentage = 20.0;

        user.changeHappiness(positivePercentage);
        user.checkDiapason(user.getHappiness());

        return prr();
    }
}
