package com.rakovets.course.java.core.practice.enum_types;

public interface FavoriteSeason {
    default String printFavoriteSeason(Seasons favoriteSeason) {
        String result;

        switch (favoriteSeason) {
            case SPRING:
                result = "I like Spring!";
                break;
            case SUMMER:
                result = "I like Summer!";
                break;
            case AUTUMN:
                result = "I like Autumn!";
                break;
            case WINTER:
                result = "I like Winter!";
                break;
            default:
                result = "There is no such season!";
        }

        return result;
    }
}
