package com.rakovets.course.java.core.practice.enum_types;

public enum Seasons {
    SUMMER(19.5) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    AUTUMN(6.8),
    WINTER(-5.4),
    SPRING(9.7);

    private final double middleTemperature;

    Seasons(double middleTemperature) {
        this.middleTemperature = middleTemperature;
    }

    public double getMiddleTemperature() {
        return middleTemperature;
    }

    public String getDescription() {
        return "Cold season";
    }
}
