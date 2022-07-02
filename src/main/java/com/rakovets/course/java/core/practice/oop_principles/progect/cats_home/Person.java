package com.rakovets.course.java.core.practice.oop_principles.progect.cats_home;

public class Person {
    private double happiness;

    /**
     * @param happiness accepts amount of happiness.
     */
    public Person(double happiness) {
        checkDiapason(happiness);
    }

    /**
     * Increases the current percentage of happiness by percentHappiness.
     *
     * @param percentHappiness changes the indicator of happiness.
     * @return percentage of happiness.
     */
    public double changeHappiness(double percentHappiness) {
        return happiness += percentHappiness;
    }

    public double getHappiness() {
        if (happiness > 100.0) {
            return 100.0;
        } else if (happiness < 0.0) {
            return happiness = 0.0;
        } else {
            return happiness;
        }
    }

    public void setHappiness(double happiness) {
        checkDiapason(happiness);
    }

    /**
     * Makes the validation.
     *
     * @param happiness accepts amount of happiness.
     */
    private void checkDiapason(double happiness) {
        if (happiness >= 100.0) {
            this.happiness = 100.0;
        } else {
            this.happiness = Math.max(happiness, 0.0);
        }
    }
}
