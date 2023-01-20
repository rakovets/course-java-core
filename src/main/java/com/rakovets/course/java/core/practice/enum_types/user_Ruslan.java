package com.rakovets.course.java.core.practice.enum_types;

public class user_Ruslan {
    private final season loveSeason = season.WINTER;

    public season getLoveSeason() {
        return loveSeason;
    }
    public void iLove() {
        switch (loveSeason) {
            case WINTER:
                System.out.println("I love " + season.WINTER);
                break;
            case AUTUMN:
                System.out.println("I Love " + season.AUTUMN);
                break;
            case SUMMER:
                System.out.println("I love " + season.SUMMER);
                break;
            case SPRING:
                System.out.println("I love " + season.SPRING);
                break;
        }
    }
    public void allTemperature() {
        System.out.println(season.WINTER + " have temperature " + season.WINTER.getTemperature() + " " + season.WINTER.getDescription());
        System.out.println(season.SPRING + " have temperature " + season.SPRING.getTemperature() + " " + season.SPRING.getDescription());
        System.out.println(season.AUTUMN + " have temperature " + season.AUTUMN.getTemperature() + " " + season.AUTUMN.getDescription());
        System.out.println(season.SUMMER + " have temperature " + season.SUMMER.getTemperature() + " " + season.SUMMER.getDescription());
    }
}
