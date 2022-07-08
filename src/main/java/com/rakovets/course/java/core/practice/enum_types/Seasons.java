package com.rakovets.course.java.core.practice.enum_types;

public enum Seasons {
    WINTER(-15),
    SPRING(5),
    SUMMER(28) {
        @Override
        public String getDescription() {
            return "Hot season";
        }
    },
    FALL(16);

    private static final Seasons FAVORITE_SEASON = Seasons.FALL;
    private final int MONTHLY_AVERAGE_TEMPERATURE;

    Seasons(int MONTHLY_AVERAGE_TEMPERATURE) {
        this.MONTHLY_AVERAGE_TEMPERATURE = MONTHLY_AVERAGE_TEMPERATURE;
    }

    public String findFavoriteSeason(Seasons season) {
        String result = "";
        switch (season) {
            case WINTER:
                result = "I like " + Seasons.WINTER;
                break;
            case SPRING:
                result = "I like " + Seasons.SPRING;
                break;
            case SUMMER:
                result = "I like " + Seasons.SUMMER;
                break;
            case FALL:
                result =  "I like " + Seasons.FALL;
                break;
        }
        return result;
    }

    public String getDescription() {
        return "Cold season";
    }

    public void printFavoriteSeasonInfo() {
        System.out.println(FAVORITE_SEASON + " is my favorite one. To be honest this is " +
                FAVORITE_SEASON.getDescription() + " and the temperature is: " +
                FAVORITE_SEASON.MONTHLY_AVERAGE_TEMPERATURE + " C.");
    }

    public void printAllSeasonsInfo() {
        for (Seasons season : Seasons.values()) {
            System.out.println(season + " is a " + season.getDescription() + " with " + season.MONTHLY_AVERAGE_TEMPERATURE + " C average temperature." );
        }

    }

}
