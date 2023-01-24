package com.rakovets.course.java.core.practice.enum_types;

public interface SeasonDescription {
    default String favoriteSeasonInfo() {
        String favoriteSeasonInfo;

        favoriteSeasonInfo = "Spring is a transition season between the winter and summer seasons. The days get \n" +
                "longer and nights get shorter, the temperatures are milder, and flowers bloom. There is a warm \n" +
                "wind in the spring season in the air. Spring typically begins in March and usually lasts until \n" +
                "May or June.";

        return favoriteSeasonInfo;
    }

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

    default String getDescription() {
        String result;
        Season season = new Season(Seasons.SPRING);

        switch (season.getSeason()) {
            case SPRING:
            case WINTER:
            case SUMMER:
            case AUTUMN:
                result = "It's cold time of year.";
                break;
            default:
                result = "There is no such season!";
        }

        return result;
        }
}
