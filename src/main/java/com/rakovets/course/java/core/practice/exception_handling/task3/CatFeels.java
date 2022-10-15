package com.rakovets.course.java.core.practice.exception_handling.task3;

public class CatFeels {
    String good;
    public boolean catEats;
    public boolean catIsDrinking;
    public boolean catIsSleeping;

    public CatFeels(String good) {
        this.good = good;
    }

    public void eats() {
        this.catEats = true;
    }

    public void isDrinking() {
        this.catIsDrinking = true;
    }

    public void isSleeping() {
        this.catIsSleeping = true;
    }

    public String good() throws CatFeelsSoGoodException {
        if (catEats && catIsDrinking && catIsSleeping) {
            return good();
        } else {
            throw new CatFeelsSoGoodException("bad");
        }
    }
}
