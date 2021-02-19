package com.rakovets.course.java.core.practice.io.ComputerRepairWorkshop;

import java.io.Serializable;

public class Computer implements Serializable {
    private final String manufacturer;
    private final String model;

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
