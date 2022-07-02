package com.rakovets.course.java.core.practice.enum_types;

public enum Seasons {
    WINTER(-15),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    AUTUMN(10);

    private final int averageTemperature;

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public static String getFavouriteSeason(Seasons season) {
        return "My favourite season is " + season + ". Average temperature: " +
                season.averageTemperature + ". " + season.getDescription();
    }

    public static String determineFavouriteSeason(Seasons season) {
        String result = "";
        switch (season) {
            case WINTER:
                result = "I love winter";
                System.out.println(result);
                break;
            case SPRING:
                result = "I love spring";
                System.out.println(result);
                break;
            case SUMMER:
                result = "I love summer";
                System.out.println(result);
                break;
            case AUTUMN:
                result = "I love autumn";
                System.out.println(result);
                break;
        }
        return result;
    }

    public static void printTheSeasonInfo() {
        for (Seasons season : Seasons.values()) {
            System.out.println(season.name() + ":Temperature is " + season.averageTemperature + ". " + season.getDescription());
        }
    }

    public String getDescription() {
        return "Cold season";
    }
}
