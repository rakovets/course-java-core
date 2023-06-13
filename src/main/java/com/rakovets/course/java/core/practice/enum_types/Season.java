package com.rakovets.course.java.core.practice.enum_types;

public enum Season {
    WINTER(-20, "Cold"), SPRING(10, "Warm"), SUMMER(20, "Hot"), AUTUMN(15, "Not bad");

    private int avgTemp;
    private String description;

    Season(int avgTemp, String description) {
        this.avgTemp = avgTemp;
        this.description = description;
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Warm season";
        } else {
            return description;
        }
    }
}
