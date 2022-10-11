package com.rakovets.course.java.core.practice.enum_types;

public enum MySeasonEnum {
    Зима(-5) {
        @Override
        public String printDescriptionOfSeason() {
            return "холодное время года";
        }
    },
    Весна(15) {
        @Override
        public String printDescriptionOfSeason() {
            return "красивое время года";
        }
    },

    Лето(25) {
        @Override
        public String printDescriptionOfSeason() {
            return "теплое время года";
        }
    },
    Осень(10) {
        @Override
        public String printDescriptionOfSeason() {
            return "дождливое время года";
        }
    };

    private int middleTemperatureOfSeason;

    MySeasonEnum(int middleTemperatureOfSeason) {
        this.middleTemperatureOfSeason = middleTemperatureOfSeason;
    }

    public int getMiddleTemperatureOfSeason() {
        return middleTemperatureOfSeason;
    }

    public abstract String printDescriptionOfSeason();
}
