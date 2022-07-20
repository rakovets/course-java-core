package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

public class Sphynx extends Cat {
    private static final String MEW = "meow";
    private static final String PRR = "prr-rr-rr";

    /**
     * Constructor.
     *
     * @param name cat's name.
     */
    public Sphynx(String name) {
        super(name);
    }

    /**
     * The cat meows.
     *
     * @return text "meow".
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
     * @return text "meow".
     */
    @Override
    protected String mew(Person user) {
        double negativePercentage = -10.0;

        user.changeHappiness(negativePercentage);
        user.checkDiapason(user.getHappiness());

        return mew();
    }

    /**
     * The cat purrs.
     *
     * @return text "prr-rr-rr".
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
     * @return text "prr-rr-rr".
     */
    @Override
    protected String prr(Person user) {
        double positivePercentage = 10.0;

        user.changeHappiness(positivePercentage);
        user.checkDiapason(user.getHappiness());

        return prr();
    }
}
