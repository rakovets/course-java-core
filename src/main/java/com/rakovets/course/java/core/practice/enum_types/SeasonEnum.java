package com.rakovets.course.java.core.practice.enum_types;

public enum SeasonEnum {
    SUMMER(21),
    WINTER(-7),
    SPRING(12),
    AUTUMN(8);
    public static SeasonEnum favoriteSeason = SeasonEnum.SUMMER;
    int averageTemperature;

    SeasonEnum(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
    public String getMyFavoriteSeason(SeasonEnum seasonEnum) {
        String information = "Favorite season is " + favoriteSeason;
        return information;
    }
    public String findFavoriteSeason(SeasonEnum season) {
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
    public String getDescription(SeasonEnum seasons) {
        String descriptionSeason = null;
        switch (seasons) {
            case SUMMER:
                return "21 degree - Hot season";
            case SPRING:
                return "12 degree - Warm season";
            case WINTER:
                return "-7 degree - Cold season";
            case AUTUMN:
                return "8 degree - Warm season";
            default:
                break;
        }
        return descriptionSeason;
    }
    public void printInfoAboutSeasons() {
        for (SeasonEnum season : SeasonEnum.values()) {
            String fullInformation = SeasonEnum + season.averageTemperature + season.getDescription();
            return fullInformation;
        }
    }
}

