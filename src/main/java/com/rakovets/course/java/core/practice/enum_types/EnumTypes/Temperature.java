package com.rakovets.course.java.core.practice.enum_types.EnumTypes;

enum Temperature {
    AVERAGE_WINTER_TEMPERATURE("-5C"),
    AVERAGE_SPRING_TEMPERATURE("+15C"),
    AVERAGE_SUMMER_TEMPERATURE("+25C"),
    AVERAGE_AUTUMN_TEMPERATURE("+10C");
    private final String temperature;

    Temperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}
