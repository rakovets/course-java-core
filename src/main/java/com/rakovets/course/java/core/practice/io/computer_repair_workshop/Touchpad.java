package com.rakovets.course.java.core.practice.io.computer_repair_workshop;

import java.io.Serializable;

public class Touchpad implements Serializable {
    private final String model;
    private String driverVersion;

    public Touchpad(String model, String driverVersion) {
        this.model = model;
        this.driverVersion = driverVersion;
    }

    public String getModel() {
        return model;
    }

    public String getDriverVersion() {
        return driverVersion;
    }

    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }

    @Override
    public String toString() {
        return "'" + model + '\'' + ", driverVersion: " + driverVersion;
    }
}
