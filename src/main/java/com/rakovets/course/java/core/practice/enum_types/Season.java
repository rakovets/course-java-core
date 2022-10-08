package com.rakovets.course.java.core.practice.enum_types;

public enum Season {
    WINTER("-15C"),
    SPRING("+15C"),
    SUMMER("+25C"),
    AUTUMN("+12");
    private final String temperature;

    Season(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}
