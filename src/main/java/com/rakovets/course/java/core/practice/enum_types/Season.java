package com.rakovets.course.java.core.practice.enum_types;

import java.util.Arrays;

public enum Season {
    AUTUMN("+10"),
    WINTER("-20"),
    SPRING("+15"),
    SUMMER("+25") {
        @Override
        public String getDescription() {
            return "is warm";
        }
    };

    private final String averageTemperature;
    private String myFavouriteSeason;

    public String myFavouriteSeason() {
        return "My favourite season is " + Season.AUTUMN + ", it's average temperature is " + Season.AUTUMN.averageTemperature;
    }

    Season(String averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getAverageTemperature() {
        return averageTemperature;
    }

    public static String likeSeasonOrNot(Season season) {
        String likeSeasonOrNot = "";
        switch (season) {
            case SUMMER:
                likeSeasonOrNot = "I like summer";
            case WINTER:
            case AUTUMN:
            case SPRING:
                likeSeasonOrNot = "I don't like it";
        }
        return likeSeasonOrNot;
    }

    public String getDescription() {
        return "is cold";
    }

    public String getInfoAllAboutSeasons() {
        return
                Season.WINTER + ": Average temperature is " + Season.WINTER.getAverageTemperature() + " it " + Season.WINTER.getDescription() + "\n" +
                        Season.SPRING + ": Average temperature is " + Season.SPRING.getAverageTemperature() + " it " + Season.SPRING.getDescription() + "\n" +
                        Season.SUMMER + ": Average temperature is " + Season.SUMMER.getAverageTemperature() + " it " + Season.SUMMER.getDescription() + "\n" +
                        Season.AUTUMN + ": Average temperature is " + Season.AUTUMN.getAverageTemperature() + " it " + Season.AUTUMN.getDescription() + "\n";
    }
}
