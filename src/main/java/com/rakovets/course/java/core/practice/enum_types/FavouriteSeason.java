package com.rakovets.course.java.core.practice.enum_types;

public class FavouriteSeason {
    private final Season favoriteSeason = Season.SUMMER;

    public String favourite() {
        String result = "";
        switch (favoriteSeason) {
            case WINTER:
                result  = "I love winter";
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

    public Season getFavoriteSeason() {
        return favoriteSeason;
    }

    public String print() {
        return favoriteSeason.getDescription();
    }
}
