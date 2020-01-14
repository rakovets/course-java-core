package com.rakovets.java.practice.io;

import java.io.Serializable;

public class Touchpad implements Serializable {
    private String model;
    private String color;
    private Integer weith;

    public Touchpad(String model, String color, Integer weith) {
        this.model = model;
        this.color = color;
        this.weith = weith;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getWeith() {
        return weith;
    }

    @Override
    public String toString() {
        return String.format("\nTouchpad : \nModel - %s\n Color -%s\n Weith -%d"
                , getColor()
                , getModel()
                , getWeith());
    }
}
