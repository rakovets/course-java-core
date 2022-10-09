package com.rakovets.course.java.core.practice.enum_types;

import com.rakovets.course.java.core.example.enum_types.model.Season;

public class SeasonsDemo {
    public static void main(String[] args) {
        Seasons winter = Seasons.WINTER;
        Seasons spring = Seasons.SPRING;

        System.out.println(Seasons.myFavouriteSeason(Seasons.WINTER));
        System.out.println(winter.getDescription());
        System.out.println(spring.getDescription());
        winter.printInfoAllSeasons();
        winter.printInfoMyFavouriteSeason();
    }
}
