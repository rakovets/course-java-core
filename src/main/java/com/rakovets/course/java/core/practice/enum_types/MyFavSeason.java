package com.rakovets.course.java.core.practice.enum_types;

public class MyFavSeason {
    private final Season myFavSeason = Season.SUMMER;

    public Season getMyFavSeason() {
        return myFavSeason;
    }

    public void printFavSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("I love winter!");
                break;
            case SPRING:
                System.out.println("I love spring!");
                break;
            case SUMMER:
                System.out.println("I love summer!");
                break;
            case AUTUMN:
                System.out.println("I love autumn!");
                break;
        }
    }

    public void aboutSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Winter have middle temperature " + Season.WINTER.getMiddleTemperature() + ". "
                + Season.WINTER.getDescription());
                break;
            case SPRING:
                System.out.println("Spring have middle temperature " + Season.SPRING.getMiddleTemperature() + ". "
                        + Season.SPRING.getDescription());
                break;
            case SUMMER:
                System.out.println("Summer have middle temperature " + Season.SUMMER.getMiddleTemperature() + ". "
                        + Season.SUMMER.getDescription());
                break;
            case AUTUMN:
                System.out.println("Autumn have middle temperature " + Season.AUTUMN.getMiddleTemperature() + ". "
                        + Season.AUTUMN.getDescription());
                break;
        }
    }

    public void seasonDescription() {
        for (Season s : Season.values()) {
            System.out.printf("%s %s %s \n", s, s.getMiddleTemperature(), s.getDescription());
        }
    }
}
