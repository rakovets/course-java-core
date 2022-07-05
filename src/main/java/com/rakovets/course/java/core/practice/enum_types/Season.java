package com.rakovets.course.java.core.practice.enum_types;

public enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(19) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    AUTUMN(7);

    private static final Season MY_FAVORITE_SEASON = Season.SUMMER;
    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public static String findFavoriteSeason(Season season) {
        String result;
        switch (season) {
            case WINTER:
                result = "I like winter";
                break;
            case SPRING:
                result = "I like spring";
                break;
            case SUMMER:
                result = "I like summer";
                break;
            case AUTUMN:
                result = "I like autumn";
                break;
            default:
                result = "Write season correct!";
                break;
        }
        return result;
    }

    public String getDescription() {
        return "Cold season";
    }

    public static String printMyFavoriteSeason() {
        return MY_FAVORITE_SEASON + " is my favorite season. It's " + MY_FAVORITE_SEASON.getDescription() + ". Average temperature in season: " + MY_FAVORITE_SEASON.averageTemperature;
    }

    public static void getAllSeasonInformation() {
        for (Season season : Season.values()) {
            System.out.println(season + " it's " + season.getDescription() + ". Average temperature in season: " + season.averageTemperature);
        }
    }
}
