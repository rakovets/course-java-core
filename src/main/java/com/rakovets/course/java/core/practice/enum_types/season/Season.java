package com.rakovets.course.java.core.practice.enum_types.season;
public enum Season {
    SPRING(+9),
    SUMMER(+23) {
        @Override
        public String getDescription() {
            return "warm";
        }
    },
    AUTUMN(+12),
    WINTER(-7);

    private int averageTemp;

    Season(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public void setHealth(Season season, int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public static String myFavouriteSeason(Season season) {
        return "My favourite season is " + season;
    }

    public static String likeMyFavouriteSeason(Season season) {
        return season.name() + "- my family loves this time of year and - " + season.likeSeason(season);
    }

    public String likeSeason(Season season) {
        switch (season) {
            case SUMMER:
                return "I like SUMMER";
            case WINTER:
                return "I like WINTER";
            case AUTUMN:
                return "I like AUTUMN";
            case SPRING:
                return "I like SPRING";
        }
        return null;
    }

    public String getDescription() {
        return "cold";
    }

    public static void getAllAboutSeasons() {
        for (Season season : Season.values()) {
            System.out.printf("season is:  ' %s ', average temperature is:  ' %s ' C, this season is: - %s\n", season.name(), season.getAverageTemp(), season.getDescription());
        }
    }
}
