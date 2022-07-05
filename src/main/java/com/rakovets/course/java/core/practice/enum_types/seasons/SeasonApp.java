package com.rakovets.course.java.core.practice.enum_types.seasons;

public class SeasonApp {
    public static void main(String[] args) {
        Season fall = Season.FALL;
        Season summer = Season.SUMMER;

        System.out.println(fall.findFavoriteSeason(fall));
        System.out.println(fall.getDescription());
        System.out.println(summer.getDescription());

        fall.printFavoriteSeasonInfo();
        fall.printAllSeasonsInfo();
    }
}
