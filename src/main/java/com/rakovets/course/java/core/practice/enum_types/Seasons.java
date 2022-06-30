package com.rakovets.course.java.core.practice.enum_types;

public enum Seasons {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    public static void displayFavouriteSeason(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
                break;
        }
    }
}


