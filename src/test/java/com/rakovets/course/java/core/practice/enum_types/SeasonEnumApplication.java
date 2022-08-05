package com.rakovets.course.java.core.practice.enum_types;

public class SeasonEnumApplication {
    public static void main(String[] args) {
        System.out.println(SeasonEnum.myFavoriteTimeYear());
        System.out.println(SeasonEnum.displayText(SeasonEnum.SUMMER));
        SeasonEnum.informationSeason();
    }
}
