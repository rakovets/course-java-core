package com.rakovets.course.java.core.practice.io.computer_repair_workshop;

public class Notebook extends Computer {
    private final  Touchpad touchpad;
    private final transient int diagonal;

    public Notebook(String producer, String model, int productionYear, double price, Touchpad touchpad, int diagonal) {
        super(producer, model, productionYear, price);
        this.touchpad = touchpad;
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public Touchpad getTouchpad() {
        return touchpad;
    }
}
