package com.rakovets.course.java.core.practice.enum_types.EnumTypes;

public class EnumTypes {
    private final Year favoriteSeason = new Year(Season.SUMMER);

    public void getFavoriteSeason() {
        System.out.println(favoriteSeason.seasonOfTheYear);
    }

    public void favorite() {
        switch (favoriteSeason.seasonOfTheYear) {
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

    public void getDescription(Season seasonOfTheYear) {
        switch (favoriteSeason.seasonOfTheYear) {
            case WINTER:
            case AUTUMN:
                System.out.println("Cold season");
                break;
            case SPRING:
            case SUMMER:
                System.out.println("Warm season");
                break;
        }
    }

    public void display() {
        System.out.println(
                Season.WINTER + ": Average temperature is " + Season.WINTER.getTemperature() + " - Cold season" + "\n" +
                Season.SPRING + ": Average temperature is " + Season.SPRING.getTemperature() + " - Warm season" + "\n" +
                Season.SUMMER + ": Average temperature is " + Season.SUMMER.getTemperature() + "- Warm season" + "\n" +
                Season.AUTUMN + ": Average temperature is " + Season.AUTUMN.getTemperature() + " - Cold season");
    }
}
