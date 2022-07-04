package com.rakovets.course.java.core.practice.enum_types.season;

public class SeasonApplication {
    public static void main(String[] args) {
        Season seasonSpring = Season.SPRING;
        Season seasonSummer = Season.SUMMER;
        Season seasonWinter = Season.WINTER;
        Season seasonAutum = Season.AUTUMN;

        System.out.println(Season.myFavouriteSeason(seasonSpring));
        System.out.println(Season.likeMyFavouriteSeason(seasonSpring));
        System.out.println(Season.myFavouriteSeason(seasonSummer));
        System.out.println(Season.likeMyFavouriteSeason(seasonSummer));
        System.out.println(Season.myFavouriteSeason(seasonWinter));
        System.out.println(Season.likeMyFavouriteSeason(seasonWinter));
        System.out.println(Season.myFavouriteSeason(seasonAutum));
        System.out.println(Season.likeMyFavouriteSeason(seasonAutum));
        seasonAutum.setHealth((seasonAutum),10);
        Season.getAllAboutSeasons();            }
}
