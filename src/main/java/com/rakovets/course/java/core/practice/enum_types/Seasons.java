package com.rakovets.course.java.core.practice.enum_types;

enum Seasons {
    SPRING("+15") ,
    SUMMER("+25") {
        @Override
        public String getDescription() {
            return "warm season";
        }
    },
    AUTUMN("+15"),
    WINTER("-5");
    private final String averageTemperature;

    Seasons(String averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getAverageTemperature() {
        return averageTemperature;
    }

    public static void getMessage(Seasons season) {
        switch(season) {
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

    public String getDescription() {
        return "cold season";
    }
}
