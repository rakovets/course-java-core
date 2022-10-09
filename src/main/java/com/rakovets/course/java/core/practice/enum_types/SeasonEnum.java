package com.rakovets.course.java.core.practice.enum_types;

public enum SeasonEnum {
    SUMMER("Summer", 26, " °C"),
    WINTER("Winter", -13, " °C"),
    SPRING("Spring", 17, " °C"),
    FALL("Autumn", -5, " °C");

    private final String name;
    private final int averageSeasonalTemperature;
    private final String degree;

    SeasonEnum(String name, int averageSeasonalTemperature, String degree) {
        this.name = name;
        this.averageSeasonalTemperature = averageSeasonalTemperature;
        this.degree = degree;
    }

    public void print() {
        System.out.println(this.name.concat(", with an average temperature " + this.averageSeasonalTemperature + degree));
    }

    public int getTemperature() {
        return averageSeasonalTemperature;
    }
}
