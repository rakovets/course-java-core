package com.rakovets.course.java.core.practice.enum_types;

public class SeasonsUtil {
    public String getSeasonType(Seasons season) {
        switch (season) {
            case SPRING:
                return "I love spring";
            case SUMMER:
                return "I love summer";
            case AUTUMN:
                return "I love autumn";
            case WINTER:
                return "I love winter";
        }
        return null;
    }
}
