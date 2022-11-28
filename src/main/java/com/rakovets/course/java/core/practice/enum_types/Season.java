package com.rakovets.course.java.core.practice.enum_types;

public enum Season {
    WINTER(-25.0),
    SPRING(15.0),
    SUMMER(25.0),
    AUTUMN(-20.0);

    private final double averageTemperature;

    Season(double temperature) {
        this.averageTemperature = temperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }
}
