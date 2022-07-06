package com.rakovets.course.java.core.practice.enum_types;

    public enum Seasons {
        Spring( 15), Summer(25){
            @Override
            public String getDescription() {
                return "Warm season";
            }
            }, Autumn(18), Winter(-5);

            public static Seasons showFavouriteSeason = Seasons.Winter;
            private final int temperature;

            public static String findFavoriteSeason(Seasons season) {
                String result = null;
                switch (season) {
                    case Winter:
                        result = "I like winter";
                        break;
                    case Spring:
                        result = "I like spring";
                        break;
                    case Summer:
                        result = "I like summer";
                        break;
                    case Autumn:
                        result = "I like autumn";
                        break;
                }
                return result;
            }

            Seasons(int temperature) {
                this.temperature = temperature;
            }
            public String getDescription() {
                return "Cold season";
            }
            public static String showFavouriteSeason(Seasons season) {
                return season.findFavoriteSeason(season);
            }
            public static void getAllAboutSeasons() {
            for (Seasons season : Seasons.values()) {
                System.out.printf("Season is: " + season.name() + ". Average temperature - " + season.temperature
                        + " - " + season.getDescription() + "; ");
            }
        }
    }
