package com.rakovets.course.java.core.practice.enum_types;

import com.rakovets.course.java.core.example.enum_types.model.Season;

public class EnumApp {
    public static void main(String[] args) {
        Season theBestSeason = Season.FALL;
        System.out.println(theBestSeason);
    }

    enum Season {
        SUMMER,
        FALL,
        WINTER,
        SPRING
    }

    public String iLoveSeason(Season) {
        switch (Season) {

        }
    }
}
