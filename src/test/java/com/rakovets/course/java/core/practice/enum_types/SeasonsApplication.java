package com.rakovets.course.java.core.practice.enum_types;

public class SeasonsApplication {

    public static void main(String[] args) {
        Seasons favouriteSeason = Seasons.SUMMER;
        System.out.println("My favourite season is " + favouriteSeason);

        Seasons.displayFavouriteSeason(Seasons.WINTER);
        Seasons.displayFavouriteSeason(Seasons.SPRING);
        Seasons.displayFavouriteSeason(Seasons.SUMMER);
        Seasons.displayFavouriteSeason(Seasons.AUTUMN);
    }
}
