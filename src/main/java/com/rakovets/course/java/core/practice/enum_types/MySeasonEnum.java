package com.rakovets.course.java.core.practice.enum_types;

public enum MySeasonEnum {
    Зима(-5) {
        private final String DESCRIPTION_OF_SEASON = "холодное время года";

        @Override
        public String printDescriptionOfSeason() {
            return DESCRIPTION_OF_SEASON;
        }
    },
    Весна(15) {
        private final String DESCRIPTION_OF_SEASON = "красивое время года";

        @Override
        public String printDescriptionOfSeason() {
            return DESCRIPTION_OF_SEASON;
        }
    },
    Лето(25) {
        private final String DESCRIPTION_OF_SEASON = "теплое время года";

        @Override
        public String printDescriptionOfSeason() {
            return DESCRIPTION_OF_SEASON;
        }
    },
    Осень(10) {
        private final String DESCRIPTION_OF_SEASON = "дождливое время года";

        @Override
        public String printDescriptionOfSeason() {
            return DESCRIPTION_OF_SEASON;
        }
    };

    private int averageTemperatureOfSeason;

    MySeasonEnum(int middleTemperatureOfSeason) {
        this.averageTemperatureOfSeason = middleTemperatureOfSeason;
    }

    public abstract String printDescriptionOfSeason();

    public int getAverageTemperatureOfSeason() {
        return averageTemperatureOfSeason;
    }
}
