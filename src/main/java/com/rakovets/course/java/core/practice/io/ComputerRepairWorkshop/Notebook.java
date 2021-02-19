package com.rakovets.course.java.core.practice.io.ComputerRepairWorkshop;

import java.io.Serializable;

public class Notebook extends Computer implements Serializable {
    private final Touchpad touchpad;
    private final transient String id;
    private final String color;

    public Notebook(String manufacturer, String model, Touchpad touchpad, String id, String color) {
        super(manufacturer, model);
        this.touchpad = touchpad;
        this.id = id;
        this.color = color;
    }

    public String toString(){
        return "touchpad : " +
                this.touchpad +
                "\nid : " +
                this.id +
                "\ncolor : " +
                this.color;
    }
}
