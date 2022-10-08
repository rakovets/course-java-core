package com.rakovets.course.java.core.practice.enum_types;

public enum SeasonEnum {
    SPRING("Spring", 15), AUTUMN("Autumn", 13.1), SUMMER("Summer", 20.6), WINTER("Winter", -1.7);

    @Override
    public String toString() {
        return "SeasonEnum{" +
                "name='" + name + '\'' +
                ", averageTemperature=" + averageTemperature +
                ", description=" + getDescription() +
                '}';
    }

    private final String name;
    private final double averageTemperature;

    SeasonEnum(String name, double averageTemperature) {
        this.name = name;
        this.averageTemperature = averageTemperature;
    }

    public void print() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        switch (this) {
            case SUMMER:
                return "Warm Summer";
            case WINTER:
                return "Cold season";
            default:
                return "";
        }
    }
}
