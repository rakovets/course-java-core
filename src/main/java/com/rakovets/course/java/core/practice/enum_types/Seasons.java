package com.rakovets.course.java.core.practice.enum_types;

public enum Seasons {
    WINTER("-7"),
    SPRING("+7"),
    SUMMER("+18") {
        @Override
        public String getDescription() {
            return "warm season";
        }
    },
    AUTUMN("+5");

    private final String averageTemperature;

    Seasons(String averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "cold season";
    }

    public static void printMessage(Seasons seasons) {
        switch (seasons) {
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
                break;
        }
    }
}
