package com.rakovets.course.java.core.practice.enum_types;

public enum Task01040506Seasons {
    SPRING(15.0) {
        @Override
        public String toString() {
            String springToString = String.format("%s %,.1f %s", SPRING.name(), SPRING.getAverageTemperaturePerSeason(SPRING), SPRING.getDescription());
            return springToString;
        }
    },
    AUTUMN(10.0) {
        @Override
        public String toString() {
            String autumnToString = String.format("%s %,.1f %s", AUTUMN.name(), AUTUMN.getAverageTemperaturePerSeason(AUTUMN), AUTUMN.getDescription());
            return autumnToString;
        }
    },
    SUMMER(20.0) {
        @Override
        public String getDescription() {
            return "Warm season";
        }

        @Override
        public String toString() {
            String summerToString = String.format("%s %,.1f %s", SUMMER.name(), SUMMER.getAverageTemperaturePerSeason(SUMMER), SUMMER.getDescription());
            return summerToString;
        }
    },
    WINTER(-25.0) {
        @Override
        public String toString() {
            String winterToString = String.format("%s %,.1f %s", WINTER.name(), WINTER.getAverageTemperaturePerSeason(WINTER), WINTER.getDescription());
            return winterToString;
        }
    };

    private double averageTemperaturePerSeason;

    Task01040506Seasons(double averageTemperature) {
        this.averageTemperaturePerSeason = averageTemperature;
    }

    public String getDescription() {
        return "Cold season";
    }

    public double getAverageTemperaturePerSeason(Task01040506Seasons season) {
        return season.averageTemperaturePerSeason;
    }
}
