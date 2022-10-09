package com.rakovets.course.java.core.practice.enum_types;

public enum Seasons {

    WINTER(-20),
    SPRING(10),
    SUMMER(25),
    AUTUMN(5);

    public static Seasons favoriteSeason = Seasons.SPRING;
    int averageTemperature;

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getMyFavoriteSeason() {
        String information = "Favorite season is " + favoriteSeason;
        return information;
    }

    public String findFavoriteSeason(Seasons season) {
        String favoriteSeasons = "";
        switch (season) {
            case WINTER:
                favoriteSeasons = "I like winter";
                break;
            case SPRING:
                favoriteSeasons = "I like spring";
                break;
            case SUMMER:
                favoriteSeasons = "I like summer";
                break;
            case AUTUMN:
                favoriteSeasons = "I like autumn";
                break;
        }
        return favoriteSeasons;
    }

    public String getDescription(Seasons seasons) {
        String descriptionSeason = "";
        switch (seasons) {
            case AUTUMN:
            case WINTER:
            case SPRING:
                descriptionSeason = "It's so cold!";
                break;
            case SUMMER:
                descriptionSeason = "It's so hot!";
                break;
        }
        return  descriptionSeason;
    }

    public void printInfoAboutSeasons() {
        for (Seasons seasons: Seasons.values()) {
            System.out.println("Season: " + seasons.name() + "Average temperature: " +
                    seasons.averageTemperature + "What say... " + seasons.getDescription(seasons));
        }
    }
}
