package com.rakovets.course.java.core.practice.io;

import java.io.Serializable;

public class Touchpad implements Serializable {
    private int radius;
    private int buttons;

    public Touchpad(int radius, int buttons) {
        this.radius = radius;
        this.buttons = buttons;
    }

    public int getRadius() {
        return radius;
    }

    public int getButtons() {
        return buttons;
    }
}
