package com.rakovets.course.java.core.practice.enum_types.seasons;

public enum Season {
    WINTER(-15),
    SPRING(5),
    SUMMER(28) {
        @Override
            public String getDescription() {
            return "Hot season";
        }
    },
    FALL(18);

    private static final Season FAVORITE_SEASON = Season.FALL;
    private final int MONTHLY_AVERAGE_TEMPERATURE;

    Season(int MONTHLY_AVERAGE_TEMPERATURE) {
        this.MONTHLY_AVERAGE_TEMPERATURE = MONTHLY_AVERAGE_TEMPERATURE;
    }

    public String findFavoriteSeason(Season season) {
        String result = "";
        switch (season) {
            case WINTER:
                result = "I like " + Season.WINTER;
                break;
            case SPRING:
                result = "I like " + Season.SPRING;
                break;
            case SUMMER:
                result = "I like " + Season.SUMMER;
                break;
            case FALL:
                result =  "I like " + Season.FALL;
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
                FAVORITE_SEASON.MONTHLY_AVERAGE_TEMPERATURE + " C."); ;
    }

    public void printAllSeasonsInfo() {
        for (Season season : Season.values()) {
            System.out.println(season + " is a " + season.getDescription() + " with " + season.MONTHLY_AVERAGE_TEMPERATURE + " C average temperature." );
        }

    }

}
