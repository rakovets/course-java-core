package com.rakovets.course.java.core.practice.enum_types;

public enum Season {
    /**
     * All possible seasons.
     */
    WINTER(-1),
    SPRING(9),
    SUMMER(17) {
        /**
         * Displays a description specific to summer.
         *
         * @return description text.
         */
        @Override
        public String getDescription() {
            return "Warm season.";
        }
    },
    AUTUMN(9);

    public static final Season MY_FAVORITE_SEASONS = Season.WINTER;
    private final int TEMPERATURE;

    /**
     * Constructor.
     *
     * @param averageTemperature typical average temperature for each season.
     */
    Season(int averageTemperature) {
        this.TEMPERATURE = averageTemperature;
    }

    /**
     * Prints all the information about the favorite season.
     *
     * @return description text.
     */
    public String getMyFavoriteSeason() {
        String dot = ".";
        String favoriteSeason = "My favorite season is";
        String lf = "\n";
        String descriptionFavoriteSeason = "The average temperature for my favorite time of the year";
        String space = " ";

        return favoriteSeason + space + (MY_FAVORITE_SEASONS.toString().toLowerCase())
                + dot + lf + descriptionFavoriteSeason + space + Season.WINTER.TEMPERATURE
                + dot + space + Season.WINTER.getDescription();
    }

    /**
     * Displays a text about which season is favorite.
     *
     * @param season enum type.
     * @return test with a message for the season.
     */
    public String findsFavoriteSeason(Season season) {
        String favoriteSeason = "Favorite season is";
        String space = " ";
        String dot = ".";

        String favoriteSeasons;

        switch (season) {
            case WINTER:
                favoriteSeasons = favoriteSeason + space + Season.WINTER.toString().toLowerCase() + dot;
                break;
            case SPRING:
                favoriteSeasons = favoriteSeason + space + Season.SPRING.toString().toLowerCase() + dot;
                break;
            case SUMMER:
                favoriteSeasons = favoriteSeason + space + Season.SUMMER.toString().toLowerCase() + dot;
                break;
            case AUTUMN:
                favoriteSeasons = favoriteSeason + space + Season.AUTUMN.toString().toLowerCase() + dot;
                break;
            default:
                return null;
        }
        return favoriteSeasons;
    }

    /**
     * Displays a description related to the season.
     *
     * @return description text.
     */
    public String getDescription() {
        return "Cold season.";
    }

    /**
     * Displays text describing all seasons.
     */
    public void getDescriptionForAllSeasons() {
        String dot = ".";
        String averageTemperature = "Average temperature:";
        String space = " ";

        for (Season season : Season.values()) {
            System.out.println(season.toString().substring(0, 1).toUpperCase()
                    + season.toString().toLowerCase().substring(1) + dot + space
                    + averageTemperature + space + season.TEMPERATURE + dot + space + season.getDescription());
        }
    }
}
