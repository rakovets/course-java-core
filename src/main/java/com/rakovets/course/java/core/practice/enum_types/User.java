package com.rakovets.course.java.core.practice.enum_types;

public class User {
    private final Season seasonEnum;

    public User(Season seasonEnum) {
        this.seasonEnum = seasonEnum;
    }

    public String favouriteSeason(Season seasonEnum) {
        String season = "";
        switch (seasonEnum) {
            case WINTER:
                season = "I love winter";
                break;
            case SPRING:
                season = "I love spring";
                break;
            case SUMMER:
                season = "I love summer";
                break;
            case FALL:
                season = "I love fall";
                break;
        }
        return season;
    }

    public String getDescription(Season seasonEnum) {
        String howIsItOutside = "";
        switch (seasonEnum) {
            case FALL:
            case WINTER:
            case SPRING:
                howIsItOutside = "Cold season";
                break;
            case SUMMER:
                howIsItOutside = "Warm season";
                break;
        }
        return howIsItOutside;
    }

    public void arraySeason() {
        for (Season seasonEnum : Season.values()) {
            System.out.println(seasonEnum + " " + seasonEnum.getTemperature() + " " + getDescription(seasonEnum));
        }
    }
}
