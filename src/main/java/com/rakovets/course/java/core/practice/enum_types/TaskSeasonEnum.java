package com.rakovets.course.java.core.practice.enum_types;

public class TaskSeasonEnum {
    public static void main(String[] args) {
        MySeasonEnum season = MySeasonEnum.Лето;

        System.out.println(season);
        System.out.println(season.ordinal());
        System.out.println(season.name());
        System.out.println(season.hashCode());
        System.out.println(season.getDeclaringClass());
        System.out.println(season.compareTo(MySeasonEnum.Зима));
        System.out.println(season.compareTo(MySeasonEnum.Весна));
        System.out.println(season.compareTo(MySeasonEnum.Лето));
        System.out.println(season.compareTo(MySeasonEnum.Осень));
        System.out.println(season.getClass());
        System.out.println(season.toString());

        PrintILoveThisSeason printILoveThisSeason = new PrintILoveThisSeason();
        printILoveThisSeason.printILoveThisSeason(season);

        System.out.println(season + " " + season.printDescriptionOfSeason());

        MySeasonEnum[] seasons = MySeasonEnum.values();
        for (MySeasonEnum s : seasons) {
            System.out.println(s + " " + s.printDescriptionOfSeason() + " со средней температурой " + s.getMiddleTemperatureOfSeason());
        }
    }
}
