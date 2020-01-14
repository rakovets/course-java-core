package com.rakovets.java.practice.io;

import java.io.Serializable;

public class Notebook extends Computer implements Serializable {
    private Touchpad touchpad;
    private transient String vidioCard;

    public Notebook(int breed, String name, int value, Touchpad touchpad, String vidioCard) {
        super(breed, name, value);
        this.touchpad = touchpad;
        this.vidioCard = vidioCard;
    }

    public String getVidioCard() {
        return vidioCard;
    }

    @Override
    public String toString() {
        return String.format("Notebook :  \n Breeb - %d \n Name - %s \n Value - %d \n Vidiocard - %s\n \n"
                , getBreed()
                , getName()
                , getValue()
                , getVidioCard());
    }
}
