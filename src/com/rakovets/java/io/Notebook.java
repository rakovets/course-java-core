package com.rakovets.java.io;

public class Notebook extends Computer {
    private Touchpad touchpad;
    private int batteryCapacity;

    public Notebook(int cost, String model, Touchpad touchpad, int batteryCapacity) {
        super(cost, model);
        this.touchpad = touchpad;
        this.batteryCapacity = batteryCapacity;
    }

    public Touchpad getTouchpad() {
        return touchpad;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "touchpad=" + touchpad.getActive() +
                ", batteryCapacity=" + batteryCapacity +
                ", cost=" + getCost() +
                ", model='" + getModel() + '\'' +
                '}';
    }
}
