package com.rakovets.course.java.core.practice.enum_types;

public class EnumTypeTest {
    public static void main(String[] args) {
        FavouriteSeason myFavouriteSeason = new FavouriteSeason(Season.SUMMER);
        System.out.print(myFavouriteSeason.favourite() + ". ");
        System.out.println("This is " + myFavouriteSeason.getDescription());
        System.out.println(myFavouriteSeason);
        System.out.println("");
        for (Season season : Season.values()) {
            FavouriteSeason eachSeason = new FavouriteSeason(season);
            System.out.println(eachSeason);
        }
    }
}
