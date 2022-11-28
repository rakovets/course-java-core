package com.rakovets.course.java.core.practice.enum_types;

public class SeasonsDemo {
    public static void main(String[] args) {
        SeasonsEnum myFavoriteSeason = SeasonsEnum.SUMMER;
        FavoriteSeason favoriteSeason = new FavoriteSeason();

        System.out.printf("Season: %s, Average temperature: %d, Description: %s\n",
                myFavoriteSeason, myFavoriteSeason.getAVERAGE_TEMPERATURE(),
                myFavoriteSeason.getDescription());
        System.out.println();
        System.out.println(favoriteSeason.getFavoriteSeason(myFavoriteSeason));
        System.out.println();

        for (SeasonsEnum season : SeasonsEnum.values()) {
            System.out.printf("Season: %s, Average temperature: %d, Description: %s\n",
                    season, season.getAVERAGE_TEMPERATURE(), season.getDescription());
        }
    }
}
