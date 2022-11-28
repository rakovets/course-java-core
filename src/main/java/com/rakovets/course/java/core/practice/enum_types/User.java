package com.rakovets.course.java.core.practice.enum_types;

public class User {
    private final Season season;

    public User(Season season) {
        this.season = season;
    }

    public String loveSeason() {
        String text;
        switch (season) {
            case WINTER:
                text = "I love winter";
                break;
            case SPRING:
                text = "I love spring";
                break;
            case SUMMER:
                text = "I love summer";
                break;
            case AUTUMN:
                text = "I love autumn";
                break;
            default:
                text = "error";
                break;
        }
        return text;
    }

    public  String getDescription() {
        String result = "";
        switch (season) {
            case SUMMER:
                result = "warm season";
                break;
            case WINTER:
            case AUTUMN:
            case SPRING:
                result = "cold season";
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return "The average temperature of " + getSeason() + " - " +
                season.getAverageTemperature() + ". This is " + getDescription();
    }

    public Season getSeason() {
        return season;
    }
}
