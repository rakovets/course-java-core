package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

public class Cat {
    private String name;

    /**
     * @param name cat's name.
     */
    public Cat(String name) {
        this.name = name;
    }

    /**
     * Сat meows.
     *
     * @return meow text.
     */
    protected String mew() {
        return "mew";
    }

    /**
     * Сat meows for user and the value of the percentage of happiness for the user changes to negative.
     *
     * @param user person type object.
     */
    protected String mew(Person user) {
        final double NEGATIVE_PERCENTAGE = -5.0;

        user.changeHappiness(NEGATIVE_PERCENTAGE);

        return "mew";
    }

    /**
     * Сat purrs.
     *
     * @return text of the purr.
     */
    protected String prr() {
        return "prr";
    }

    /**
     * The cat purrs for the user, and the user's happiness percentage changes to a positive value.
     *
     * @param user person type object.
     * @return text of the purr.
     */
    protected String prr(Person user) {
        final double POSITIVE_PERCENTAGE = 5.0;

        user.changeHappiness(POSITIVE_PERCENTAGE);

        return "prr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
