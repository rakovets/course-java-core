package com.rakovets.course.java.core.practice.enum_types.EnumTypes;

enum Season {
    WINTER("-5C"),
    SPRING("+15C"),
    SUMMER("+25C"),
    AUTUMN("+10C");
    private final String temperature;

    Season(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}
