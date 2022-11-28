package com.rakovets.course.java.core.practice.enum_types;

public class EnumDemo {
    public static void main(String[] args) {
        User favSeason = new User(Season.SPRING);

        System.out.println(favSeason.loveSeason());
        System.out.println("My favorite season is " + favSeason.getSeason());
        System.out.println(favSeason + "\n");

        for (Season s : Season.values()) {
            User eachSeason = new User(s);
            System.out.println(eachSeason);
        }
    }
}
