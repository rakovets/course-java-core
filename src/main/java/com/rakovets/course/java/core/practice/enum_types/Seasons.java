package com.rakovets.course.java.core.practice.enum_types;

public enum Seasons {
    SPRING(12),
    SUMMER(27),
    WINTER(-4),
    AUTUMN(17);

    public static Seasons showFavoriteSeason = Seasons.AUTUMN;
    private final int averageTemperature;

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getMyFavoriteSeason() {
        String info = "Favorite season is: " + showFavoriteSeason;
        return info;
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

    public String getDescription(Seasons seasons){
        String descriptionSeasons = "";
        switch (seasons) {
            case SPRING:
            case AUTUMN:
            case WINTER:
                descriptionSeasons = "It's so cold";
                break;
            case SUMMER:
                descriptionSeasons = "It's so hot";
                break;
        }
        return descriptionSeasons;
    }

    public void printSeasonsInfo() {
        for (Seasons seasons: Seasons.values()) {
            System.out.printf("This seasons: " + seasons.name() + "Average temperature: " + seasons.averageTemperature + "What more " + seasons.getDescription(seasons));
        }
    }

}
