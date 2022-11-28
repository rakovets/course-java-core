package com.rakovets.course.java.core.practice.enum_types;

public class DemoEnum {
    public static void main(String[] args) {
        User favoriteSeasons = new User(Season.SUMMER);

        System.out.println(favoriteSeasons.favouriteSeason(Season.SUMMER));
        System.out.println(favoriteSeasons.getDescription(Season.SUMMER));
        favoriteSeasons.arraySeason();
    }
}
