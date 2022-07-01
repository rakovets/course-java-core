package com.rakovets.course.java.core.practice.enum_types;

public class EnumTypesApplication {
    public static void main(String[] args) {
        System.out.println(EnumTypes.Seasons.SUMMER.getMyFavouriteSeason());
        System.out.println(EnumTypes.Seasons.SUMMER.getDescription());
        EnumTypes.Seasons.SUMMER.getInfoAboutSeasons();
        System.out.println(EnumTypes.Seasons.SUMMER.findingFavouriteSeason(EnumTypes.Seasons.SUMMER));
    }
}
