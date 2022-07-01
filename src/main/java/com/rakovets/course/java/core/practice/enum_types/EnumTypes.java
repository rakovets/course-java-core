package com.rakovets.course.java.core.practice.enum_types;

import java.util.Arrays;

public class EnumTypes {
    public enum Seasons {
        AUTUMN("+10"),
        WINTER("-20"),
        SPRING("+15"),
        SUMMER("+25") {
            @Override
            public String getDescription() {
                return "warm";
            }
        };

        private final String averageTemperature;
        private String myFavouriteSeason;

        public String myFavouriteSeason() {
            return "My favourite season is " + Seasons.AUTUMN + ", it's average temperature is " + Seasons.AUTUMN.averageTemperature;
        }

        Seasons(String averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public String getAverageTemperature() {
            return averageTemperature;
        }

        public static String likeSeasonOrNot(Seasons season) {
            String likeSeasonOrNot = "";
            switch (season) {
                case SUMMER:
                    likeSeasonOrNot = "I like summer";
                case WINTER:
                case AUTUMN:
                case SPRING:
                    likeSeasonOrNot = "I don't like it";
            }
            return likeSeasonOrNot;
        }

        public String getDescription() {
            return "cold";
        }

        public String infoAllAboutSeasons() {
            String infoAllSeasons = "";
            String averageTemperature = "";
            String description = "";
            Seasons[] allSeasons = Seasons.values();
            for (Seasons season : allSeasons) {
                infoAllSeasons = Arrays.toString(allSeasons);
                averageTemperature = season.getAverageTemperature();
                description = season.getDescription();
            }
            return infoAllSeasons + "it's average temperature is - " + averageTemperature + " - " + description;
        }
    }
}
