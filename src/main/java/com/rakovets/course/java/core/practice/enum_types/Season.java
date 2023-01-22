package com.rakovets.course.java.core.practice.enum_types;

public enum Season {
    WINTER("-8"),
    SPRING("+14"),
    SUMMER("+22") {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    AUTUMN("+8");

    private final String middleTemperature;

    Season(String middleTemperature) {
        this.middleTemperature = middleTemperature;
    }

    public String getMiddleTemperature() {
        return middleTemperature;
    }

    public String getDescription() {
        return "Cold season";
    }
}
