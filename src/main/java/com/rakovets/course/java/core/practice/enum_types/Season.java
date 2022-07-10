package com.rakovets.course.java.core.practice.enum_types;

public enum Season {
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
        final String DOT = ".";
        final String FAVORITE_SEASON = "My favorite season is";
        final String LF = "\n";
        final String DESCRIPTION_FAVORITE_SEASON = "The average temperature for my favorite time of the year";
        final String SPACE = " ";

        return FAVORITE_SEASON + SPACE + (MY_FAVORITE_SEASONS.toString().toLowerCase())
                + DOT + LF + DESCRIPTION_FAVORITE_SEASON + SPACE + Season.WINTER.TEMPERATURE
                + DOT + SPACE + Season.WINTER.getDescription();
    }

    /**
     * Displays a text about which season is favorite.
     *
     * @param season enum type.
     * @return test with a message for the season.
     */
    public String findsAFavoriteSeason(Season season) {
        final String FAVORITE_SEASON = "Favorite season is";
        final String SPACE = " ";
        final String DOT = ".";

        String favoriteSeason = null;

        switch (season) {
            case WINTER:
                favoriteSeason = FAVORITE_SEASON + SPACE + Season.WINTER.toString().toLowerCase() + DOT;
                break;
            case SPRING:
                favoriteSeason = FAVORITE_SEASON + SPACE + Season.SPRING.toString().toLowerCase() + DOT;
                break;
            case SUMMER:
                favoriteSeason = FAVORITE_SEASON + SPACE + Season.SUMMER.toString().toLowerCase() + DOT;
                break;
            case AUTUMN:
                favoriteSeason = FAVORITE_SEASON + SPACE + Season.AUTUMN.toString().toLowerCase() + DOT;
                break;
        }
        return favoriteSeason;
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
        final String DOT = ".";
        final String AVERAGE_TEMPERATURE = "Average temperature:";
        final String SPACE = " ";

        for (Season season : Season.values()) {
            System.out.println(season.toString().substring(0, 1).toUpperCase()
                    + season.toString().toLowerCase().substring(1) + DOT + SPACE
                    + AVERAGE_TEMPERATURE + SPACE + season.TEMPERATURE + DOT + SPACE + season.getDescription());
        }
    }
}
