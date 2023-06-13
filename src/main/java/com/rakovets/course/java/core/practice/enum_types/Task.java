package com.rakovets.course.java.core.practice.enum_types;

public class Task {

    public static void main(String[] args) {
        Season mySeason = Season.SUMMER;
        System.out.println(mySeason + " - " + "bla..bla");
        printSeason(Season.SPRING);
        getAllSeason();
    }

    public static void printSeason(Season season) {
        switch (season) {
            case AUTUMN:
                System.out.println("Я люблю Осень");
                break;
            case SUMMER:
                System.out.println("Я люблю Лето");
                break;
            case SPRING:
                System.out.println("Я люблю Весну");
                break;
            case WINTER:
                System.out.println("Я люблю Зиму");
                break;
        }
    }

    public static void getAllSeason() {
        for (Season season : Season.values()) {
            System.out.println(season + " - " + season.getAvgTemp() + ", " + season.getDescription());
        }
    }
}
