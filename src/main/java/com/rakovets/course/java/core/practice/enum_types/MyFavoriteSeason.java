package com.rakovets.course.java.core.practice.enum_types;

public class MyFavoriteSeason {
    public static void main(String[] args) {
        SeasonEnum season = SeasonEnum.SUMMER;
        season.print();
        System.out.println("Summer is the best season for me and perhaps for the majority of people.");
        System.out.println("Both adults and kids enjoy summertime, because it offers the longest holidays.");
        System.out.println("Besides, it is rather sunny and warm in our region at this time of the year, so we enjoy the lake and the sun.");
        MyFavoriteSeason love = new MyFavoriteSeason();
        love.print(season);
        love.printAllSeasonInfo();
    }

    public void print(SeasonEnum season) {
        switch (season) {
            case SUMMER:
                System.out.println("I love Summer");
                break;
            case AUTUMN:
                System.out.println("I love Autumn");
                break;
            case SPRING:
                System.out.println("I love Spring");
                break;
            case WINTER:
                System.out.println("I love Winter");
                break;
        }
    }

    public void printAllSeasonInfo() {
        for (SeasonEnum season : SeasonEnum.values()) {
            System.out.println(season);
        }
    }
}
