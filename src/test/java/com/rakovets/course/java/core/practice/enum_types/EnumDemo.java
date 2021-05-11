package com.rakovets.course.java.core.practice.enum_types;

public class EnumDemo {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.SUMMER;
        System.out.println("My favorite season in year - " + favoriteSeason);
        Seasons.printMessage(favoriteSeason);

        Seasons[] allSeasonsInYear = Seasons.values();
        for (Seasons season : allSeasonsInYear) {
            System.out.println("Message about " + season + ", average temperature - " + season.getAverageTemperature() + ", " + season.getDescription());
        }
    }
}
