package com.rakovets.course.java.core.practice.io;

import java.io.Serializable;

public class Computer implements Serializable {
    private String manufacturer;
    private String model;
    private int year;

    public Computer(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "COMPUTER\n" +
                "Manufacturer: " + getManufacturer() +
                ", Model: " + getModel() +
                ", Year: " + getYear() + "\n";
    };
}
