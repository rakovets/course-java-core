package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

public class Person {
    protected final double MAXIMUM_PERCENTAGE_HAPPINESS = 100.0;
    protected final double MINIMUM_PERCENTAGE_HAPPINESS = 0.0;

    private double happiness;

    /**
     * Constructor.
     *
     * @param happiness user's happiness in percent.
     */
    public Person(double happiness) {
        checkDiapason(happiness);
    }

    /**
     * The user's happiness changes from interacting with cats.
     *
     * @param percentHappiness percentage of happiness.
     * @return current percentage of happiness.
     */
    protected double changeHappiness(double percentHappiness) {
        return happiness += percentHappiness;
    }

    /**
     * Does a check for a range of values from 0 to 100.
     * <p>If the value is greater than 100 then the current happiness value is 100.
     * <p>If the value is less than 0 then the current happiness value is 0.
     *
     * @param happiness the current value of happiness after checking the values.
     */
    public void checkDiapason(double happiness) {
        if (happiness >= MAXIMUM_PERCENTAGE_HAPPINESS) {
            this.happiness = MAXIMUM_PERCENTAGE_HAPPINESS;
        } else {
            this.happiness = Math.max(happiness, MINIMUM_PERCENTAGE_HAPPINESS);
        }
    }

    public double getHappiness() {
        return happiness;
    }

    /**
     * Does a check for a range of values from 0 to 100.
     * <p>If the value is greater than 100 then the current happiness value is 100.
     * <p>If the value is less than 0 then the current happiness value is 0.
     *
     * @param happiness percentage of happiness.
     */
    public void setHappiness(double happiness) {
        checkDiapason(happiness);
    }
}
