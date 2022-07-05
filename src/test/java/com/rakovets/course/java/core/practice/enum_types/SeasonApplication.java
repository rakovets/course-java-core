package com.rakovets.course.java.core.practice.enum_types;

public class SeasonApplication {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        Season winter = Season.WINTER;

        System.out.println(Season.findFavoriteSeason(summer));
        System.out.println(summer.getDescription());
        System.out.println(winter.getDescription());
        System.out.println(Season.printMyFavoriteSeason());
        Season.getAllSeasonInformation();
    }
}
