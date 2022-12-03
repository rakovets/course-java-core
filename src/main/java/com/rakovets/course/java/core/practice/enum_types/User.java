package com.rakovets.course.java.core.practice.enum_types;

public class User {
    private final Season favoriteSeason;

    public User(Season favoriteSeason) {
        this.favoriteSeason = favoriteSeason;
    }

    public String favourite() {
        String result = "";
        switch (favoriteSeason) {
            case WINTER:
                result = "I love winter";
                break;
            case SPRING:
                result = "I love spring";
                break;
            case SUMMER:
                result = "I love summer";
                break;
            case AUTUMN:
                result = "I love autumn";
                break;
        }
        return result;
    }

    public String getDescription() {
        String result = "";
        switch (favoriteSeason) {
            case WINTER:
            case SPRING:
            case AUTUMN:
                result = "cold time of the year";
                break;
            case SUMMER:
                result = "hot time of the year";
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return "The average temperature of " + getFavoriteSeason() + " is " +
                favoriteSeason.getTemperature() + " " + favoriteSeason.getMeasurement() + ". This is " + getDescription();
    }

    public Season getFavoriteSeason() {
        return favoriteSeason;
    }
}
