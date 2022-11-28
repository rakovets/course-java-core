package com.rakovets.course.java.core.practice.enum_types;

public enum SeasonsEnum {
    WINTER(-4),
    SPRING(7),
    SUMMER(18) {
        @Override
        public String getDescription() {
            return "Warm season.";
        }
    },
    AUTUMN(7);

    private final int AVERAGE_TEMPERATURE;

    SeasonsEnum(int AVERAGE_TEMPERATURE) {
        this.AVERAGE_TEMPERATURE = AVERAGE_TEMPERATURE;
    }

    public int getAVERAGE_TEMPERATURE() {
        return AVERAGE_TEMPERATURE;
    }

    public String getDescription() {
        return "Cold seasons";
    }
}
