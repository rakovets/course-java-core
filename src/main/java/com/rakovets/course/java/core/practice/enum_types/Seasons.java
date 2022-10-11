package com.rakovets.course.java.core.practice.enum_types;

public enum Seasons {
    WINTER("Winter", -10),
    SPRING("Spring", 10),
    SUMMER("Summer", 25),
    AUTUMN("Autumn", 7);

    private final String season;
    private int avarageTemperature;
    private static Seasons favouriteSeason = Seasons.SUMMER;

    Seasons(String season, int avarageTemperature) {
        this.season = season;
        this.avarageTemperature = avarageTemperature;
    }

    public String getFavouriteSeason(Seasons favouriteSeason) {
        return favouriteSeason + "- is my favourite season because of warm weather and bright colours";
    }

    public void print(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println(" I like Winter");
                break;
            case SPRING:
                System.out.println(" I like Spring");
                break;
            case SUMMER:
                System.out.println(" I like Summer");
                break;
            case AUTUMN:
                System.out.println(" I like Autumn");
                break;
        }
    }

    public String getDescription(Seasons season) {
        switch (season) {
            case SUMMER:
                return "Warm season";
            default:
                return "Cold season";
        }
    }

    public void seasonsInfo() {
        for (Seasons season : Seasons.values()) {
            System.out.println(season);
        }
    }
}

