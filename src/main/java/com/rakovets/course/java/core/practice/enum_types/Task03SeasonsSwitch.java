package com.rakovets.course.java.core.practice.enum_types;

public class Task03SeasonsSwitch {
    public static void returnSeason(Task01040506Seasons season) {
        switch (season) {
            case SPRING:
                System.out.println("I love spring");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case WINTER:
                System.out.println("I love winter");
            default:
                System.out.println("Incorrect season");
        }
    }
}
