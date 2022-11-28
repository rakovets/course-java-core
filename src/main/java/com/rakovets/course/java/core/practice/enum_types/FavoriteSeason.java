package com.rakovets.course.java.core.practice.enum_types;

public class FavoriteSeason {
    public String getFavoriteSeason(SeasonsEnum favoriteSeason) {
        String infoSeason = "UnknownSeason";

        switch (favoriteSeason) {
            case WINTER:
                infoSeason = "I love winter!";
                break;
            case SPRING:
                infoSeason = "I love spring!";
                break;
            case SUMMER:
                infoSeason = "I love summer!";
                break;
            case AUTUMN:
                infoSeason = "I love autumn!";
                break;
            default:
                break;
        }

        return infoSeason;
    }
}
