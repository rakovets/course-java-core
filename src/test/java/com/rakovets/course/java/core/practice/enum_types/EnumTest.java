package com.rakovets.course.java.core.practice.enum_types;

public class EnumTest {
    public static void main(String[] args) {
        EachSeason mySeason = new EachSeason(Season.SPRING);
        System.out.print(mySeason.loveSeason());
        System.out.println(" ");
        for (Season season : Season.values()) {
            EachSeason eachSeason = new EachSeason(season);
            System.out.println(eachSeason);
        }
    }
}
