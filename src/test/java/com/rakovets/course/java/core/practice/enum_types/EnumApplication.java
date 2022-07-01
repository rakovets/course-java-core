package com.rakovets.course.java.core.practice.enum_types;

public class EnumApplication {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season.myFavouriteSeasonAutumn());
        System.out.println(season + " average temperature is " + season.getAverageTemperature());
        System.out.println(season + " " + season.getDescription());
        System.out.println(season.getInfoAllAboutSeasons());
        System.out.println(season + " " + season.likeSeasonOrNot(season));
    }
}
