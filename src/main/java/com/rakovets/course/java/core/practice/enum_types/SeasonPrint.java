package com.rakovets.course.java.core.practice.enum_types;

public class SeasonPrint {
    public void printAll() {
        Seasons[] seasons = Seasons.values();

        for (int enumNumber = 0; enumNumber <= seasons.length - 1; enumNumber++) {
            Season season = new Season(seasons[enumNumber]);

            System.out.println(season.getSeason());
            System.out.println("Average temperature:");
            System.out.println(season.getDescription());
            System.out.println("My favorite season is Spring:");
            System.out.println(season.favoriteSeasonInfo());
            System.out.println();
        }
    }
}
