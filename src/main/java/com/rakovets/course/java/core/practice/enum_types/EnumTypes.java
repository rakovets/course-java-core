package com.rakovets.course.java.core.practice.enum_types;

public class EnumTypes {
    public enum Seasons {
        AUTUMN(10),
        WINTER(-20),
        SPRING(15),
        SUMMER(25) {
            @Override
            public String getDescription() {
                return "Warm season";
            }
        };

        private String myFavouriteSeason;
        private final int averageTemperature;

        Seasons(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public String getMyFavouriteSeason() {
            return Seasons.SUMMER + " with temperature " + Seasons.SUMMER.averageTemperature + "C";
        }

        public String findingFavouriteSeason(Seasons seasons) {
            String text = "";
            switch (seasons) {
                case AUTUMN:
                    text = "I like " + Seasons.AUTUMN;
                    break;
                case WINTER:
                    text = "I like " + Seasons.WINTER;
                    break;
                case SPRING:
                    text = "I like " + Seasons.SPRING;
                    break;
                case SUMMER:
                    text = "I like " + Seasons.SUMMER;
                    break;
            }
            return text;
        }

        public void getInfoAboutSeasons() {
            for (Seasons seasons : Seasons.values()) {
                System.out.println(seasons + " with temperature " + seasons.averageTemperature + "C " + seasons.getDescription());
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
