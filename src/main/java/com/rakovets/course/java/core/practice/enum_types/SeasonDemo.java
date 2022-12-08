package com.rakovets.course.java.core.practice.enum_types;

public class SeasonDemo {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.SUMMER;
        System.out.printf("Мое любимое время года %s\n", myFavoriteSeason);
        printFavoriteSeason(myFavoriteSeason);

        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season);
            System.out.println(season.getAverageTemperature());
            System.out.println(season.getDescription());
        }
        System.out.println(Season.SUMMER.ordinal());
    }

    public static void printFavoriteSeason(Season season) {
        String output = "";
        switch (season) {
            case AUTUMN:
                output = "Я люблю осень";
                break;
            case WINTER:
                output = "Я люблю зиму";
                break;
            case SPRING:
                output = "Я люблю весну";
                break;
            case SUMMER:
                output = "Я люблю лето";
                break;
        }
        System.out.println(output);
    }
}
