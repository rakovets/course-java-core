package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

public class Cat {
    private String name;

    /**
     * Constructor.
     *
     * @param name cat's name.
     */
    public Cat(String name) {
        this.name = name;
    }

    /**
     * The cat meows.
     *
     * @return text "mew".
     */
    protected String mew() {
        return "mew";
    }

    /**
     * The cat meows for the character.
     * <p> The character's mood drops.
     *
     * @param user character for which the cat meows.
     * @return text "mew".
     */
    protected String mew(Person user) {
        final double NEGATIVE_PERCENTAGE = -5.0;

        user.changeHappiness(NEGATIVE_PERCENTAGE);
        user.checkDiapason(user.getHappiness());

        return mew();
    }

    /**
     * The cat purrs.
     *
     * @return text "prr".
     */
    protected String prr() {
        return "prr";
    }

    /**
     * The cat purrs for the character.
     * <p>The mood of the character rises.
     *
     * @param user the character to whom the cat purrs.
     * @return text "prr".
     */
    protected String prr(Person user) {
        final double POSITIVE_PERCENTAGE = 5.0;

        user.changeHappiness(POSITIVE_PERCENTAGE);
        user.checkDiapason(user.getHappiness());

        return prr();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
