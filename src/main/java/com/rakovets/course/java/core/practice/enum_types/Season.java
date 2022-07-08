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
        return "My favorite seasons is " + (MY_FAVORITE_SEASONS.toString().toLowerCase())
                + ".\nThe average temperature for my favorite time of the year " + Season.WINTER.TEMPERATURE + ". "
                + Season.WINTER.getDescription();
    }

    /**
     * Displays a text about which season is favorite.
     *
     * @param season enum type.
     * @return test with a message for the season.
     */
    public String findsAFavoriteSeason(Season season) {
        String favoriteSeason = null;

        switch (season) {
            case WINTER:
                favoriteSeason = "Favorite season is " + Season.WINTER.toString().toLowerCase() + ".";
                break;
            case SPRING:
                favoriteSeason = "Favorite season is " + Season.SPRING.toString().toLowerCase() + ".";
                break;
            case SUMMER:
                favoriteSeason = "Favorite season is " + Season.SUMMER.toString().toLowerCase() + ".";
                break;
            case AUTUMN:
                favoriteSeason = "Favorite season is " + Season.AUTUMN.toString().toLowerCase() + ".";
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
        for (Season season : Season.values()) {
            System.out.println(season.toString().substring(0, 1).toUpperCase()
                    + season.toString().toLowerCase().substring(1)
                    + ". Average temperature: " + season.TEMPERATURE + ". " + season.getDescription());
        }
    }
}
