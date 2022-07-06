package com.rakovets.course.java.core.practice.enum_types;

public class SeasonsApplication {
    public static void main(String[] args) {
        Seasons summer = Seasons.Summer;
        Seasons winter = Seasons.Winter;

        System.out.println(Seasons.findFavoriteSeason(summer));
        System.out.println(summer.getDescription());
        System.out.println(winter.getDescription());
        System.out.println(Seasons.showFavouriteSeason(winter));
        Seasons.getAllAboutSeasons();
    }
}
