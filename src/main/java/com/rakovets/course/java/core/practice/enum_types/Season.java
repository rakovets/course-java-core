package com.rakovets.course.java.core.practice.enum_types;

public enum Season {
    WINTER(-15, TemperatureMeasurement.CELSIUS),
    SPRING(15, TemperatureMeasurement.CELSIUS),
    SUMMER(25, TemperatureMeasurement.CELSIUS),
    AUTUMN(12, TemperatureMeasurement.CELSIUS);

    private final int temperature;
    private final TemperatureMeasurement measurement;

    Season(int temperature, TemperatureMeasurement measurement) {
        this.temperature = temperature;
        this.measurement = measurement;
    }

    public int getTemperature() {
        return temperature;
    }

    public TemperatureMeasurement getMeasurement() {
        return measurement;
    }
}
