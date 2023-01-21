package com.rakovets.course.java.core.practice.enum_types;

public class Task01 {
    public static void main(String[] args) {
        Year year = new Year();
        Seasons myFavoriteSeason = Seasons.SPRING;
        year.printInfoAboutSeason(myFavoriteSeason);
        year.printLoveSeasons(myFavoriteSeason);
        year.printSeasonData();
    }
}
