package com.rakovets.course.java.core.practice.enum_types;

public enum SeasonInfo {
    WINTER(-15),
    SPRING(10),
    SUMMER(25),
    AUTUMN(10);

    private final int averageTemperature;

    SeasonInfo(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getSeasonDescription() {
        return this == SUMMER ? "Warm season" : "Cold season";
    }

    public void printTheSeasonInfo() {
        System.out.println(this.name() + ":Temperature is " + this.averageTemperature + ". " + this.getSeasonDescription());
    }
}
