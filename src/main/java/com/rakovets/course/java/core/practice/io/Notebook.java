package com.rakovets.course.java.core.practice.io;

import java.io.Serializable;

public class Notebook extends Computer implements Serializable {
    private Touchpad touchpad;
    private transient String color;

    public Notebook(String manufacturer, String model, int year, String color, Touchpad touchpad) {
        super(manufacturer, model, year);
        this.color = color;
        this.touchpad = touchpad;
    }

    public Touchpad getTouchpad() {
        return touchpad;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "NOTEBOOK\n" +
                "Manufacturer: " + getManufacturer() +
                ", Model: " + getModel() +
                ", Year: " + getYear() +
                ", Color: " + getColor() +
                ", Touchpad radius: " + getTouchpad().getRadius() +
                ", Touchpad buttons: " + getTouchpad().getButtons() + "\n";
    };
}
