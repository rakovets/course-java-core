package com.rakovets.course.java.core.practice.enum_types;

public enum Seasons {
    SPRING(5) {
        @Override
        public String getDescription() {
            return "Neither cold nor hot season";
        }
    },
    SUMMER(30) {
        @Override
        public String getDescription() {
            return "Hot season";
        }
    },
    AUTUMN(10) {
        @Override
        public String getDescription() {
            return "Neither hot nor cold season";
        }
    },
    WINTER(-30) {
        @Override
        public String getDescription() {
            return "Cold season";
        }
    };

    private final int middleTemperature;

    Seasons(int middleTemperature) {
        this.middleTemperature = middleTemperature;
    }

    public String getDescription() {
        return "Description season";
    }

    public int getMiddleTemperature() {
        return middleTemperature;
    }

    @Override
    public String toString() {
        return name();
    }
}
