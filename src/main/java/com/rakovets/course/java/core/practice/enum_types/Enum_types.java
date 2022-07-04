package com.rakovets.course.java.core.practice.enum_types;

public class Enum_types {
    public enum Season {
        WINTER(-20),
        SPRING(15),
        SUMMER(25) {
            @Override
            public String getDescription() {
                return "Warm season";
            }
        },
        AUTUMN(10);

        private final int averageTemperature;
        private String myFavouriteSeason;

        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public String getMyFavouriteSeason() {
            return Season.SUMMER + " with temperature " + Season.SUMMER.averageTemperature + "C";
        }

        public String findingFavouriteSeason(Season season) {
            String text = "";

            switch (season) {
                case AUTUMN:
                    text = "My favourite season is " + Season.AUTUMN;
                    break;
                case WINTER:
                    text = "My favourite season is " + Season.WINTER;
                    break;
                case SPRING:
                    text = "My favourite season is " + Season.SPRING;
                    break;
                case SUMMER:
                    text = "My favourite season is " + Season.SUMMER;
                    break;
            }
            return text;
        }

        public void getInfoAboutSeasons() {
            for (Season season : Season.values()) {
                System.out.println(season + " with temperature " + season.averageTemperature + "C " + season.getDescription());
            }
        }

        public String getDescription() {
            return "Cold season";
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }
    }
}
