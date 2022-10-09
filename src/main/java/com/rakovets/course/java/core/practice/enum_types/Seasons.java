package com.rakovets.course.java.core.practice.enum_types;

import com.rakovets.course.java.core.example.enum_types.model.Season;

public enum Seasons {
    AUTUMN(10),
    WINTER(-20),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "warm season";
        }
    };

    private static final Seasons MY_FAVOURITRE_SEASONS = Seasons.WINTER;
    private final int TEMPERATURE;

    Seasons(int TEMPERATURE) {
        this.TEMPERATURE = TEMPERATURE;
    }


    public static String myFavouriteSeason(Seasons seasons) {
        String result = "";
        switch (seasons) {
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
        }
        return result;
    }

    public String getDescription() {
        return "cold season";
    }

    public void printInfoMyFavouriteSeason() {
        System.out.println(MY_FAVOURITRE_SEASONS + " is my favourite season. The average temperature of " +
                MY_FAVOURITRE_SEASONS.TEMPERATURE + "C. This is " + getDescription());
    }

    public void printInfoAllSeasons() {
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons + " is a " + seasons.getDescription() + " The average temperature "
                    + seasons.TEMPERATURE + " C.");
        }
    }
}
