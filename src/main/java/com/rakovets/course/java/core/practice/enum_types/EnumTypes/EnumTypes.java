package com.rakovets.course.java.core.practice.enum_types.EnumTypes;

public class EnumTypes {

    Year favoriteSeason = new Year(Season.SUMMER);

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

    public String getDescription(Season seasonOfTheYear) {
        if (seasonOfTheYear.equals(Season.WINTER))
            return ("Cold season");
        else if (seasonOfTheYear.equals(Season.SPRING))
            return ("Warm season");
        else if (seasonOfTheYear.equals(Season.SUMMER))
            return ("Warm season");
        else if (seasonOfTheYear.equals(Season.AUTUMN))
            return ("Cold season");
        return null;
    }

    public void display() {
        System.out.println(
                Season.WINTER + ": Average temperature is " + Temperature.AVERAGE_WINTER_TEMPERATURE
                        .getTemperature() + " - Cold season" + "\n" +
                        Season.SPRING + ": Average temperature is " + Temperature.AVERAGE_SPRING_TEMPERATURE
                        .getTemperature() + " - Warm season" + "\n" +
                        Season.SUMMER + ": Average temperature is " + Temperature.AVERAGE_SUMMER_TEMPERATURE
                        .getTemperature() + "- Warm season" + "\n" +
                        Season.AUTUMN + ": Average temperature is " + Temperature.AVERAGE_AUTUMN_TEMPERATURE
                        .getTemperature() + " - Cold season");
    }
}
