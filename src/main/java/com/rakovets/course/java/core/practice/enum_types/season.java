package com.rakovets.course.java.core.practice.enum_types;

enum season {
    SUMMER("+20"),
    WINTER("-10") {
        @Override
        public String getDescription() {
            return "Cold season";
        }
    },
    AUTUMN("+10"),
    SPRING("+15");
    private final String temperature;

    season(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return "Warm season";
    }
}
