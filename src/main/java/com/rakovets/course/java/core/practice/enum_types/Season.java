package com.rakovets.course.java.core.practice.enum_types;

public enum Season {
    SUMMER(26, " °C"),
    WINTER(-13, " °C"),
    SPRING(17, " °C"),
    FALL(-5, " °C");

    private final int averageSeasonalTemperature;
    private final String degree;

    Season(int averageSeasonalTemperature, String degree) {
        this.averageSeasonalTemperature = averageSeasonalTemperature;
        this.degree = degree;
    }

    public int getTemperature() {
        return averageSeasonalTemperature;
    }
}
