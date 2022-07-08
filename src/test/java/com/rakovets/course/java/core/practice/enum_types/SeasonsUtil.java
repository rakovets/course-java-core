package com.rakovets.course.java.core.practice.enum_types;

public class SeasonsUtil {
    public static void main(String[] args) {
        Seasons fall = Seasons.FALL;
        Seasons summer = Seasons.SUMMER;

        System.out.println(fall.findFavoriteSeason(fall));
        System.out.println(fall.getDescription());
        System.out.println(summer.getDescription());

        fall.printFavoriteSeasonInfo();
        fall.printAllSeasonsInfo();
    }
}
