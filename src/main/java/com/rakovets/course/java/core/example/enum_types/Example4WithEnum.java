package com.rakovets.course.java.core.example.enum_types;


import com.rakovets.course.java.core.example.enum_types.model.Season;

public class Example4WithEnum {
    public static void main(String[] args) {
        Season expectedWinter = Season.ofMonth(12);
        System.out.println(expectedWinter);
        Season expectedSpring = Season.ofMonth(3);
        System.out.println(expectedSpring);
        Season expectedSummer = Season.ofMonth(6);
        System.out.println(expectedSummer);
        Season expectedAutumn = Season.ofMonth(9);
        System.out.println(expectedAutumn);
        Season expectedException = Season.ofMonth(13);
        System.out.println(expectedException);
    }
}
