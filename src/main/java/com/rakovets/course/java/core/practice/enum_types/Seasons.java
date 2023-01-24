package com.rakovets.course.java.core.practice.enum_types;

public enum Seasons {
    WINTER(-2.5),
    SPRING(11.3),
    SUMMER(20.1),
    AUTUMN(11.1);

    private final double averageTemperature;

    Seasons(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }
}
