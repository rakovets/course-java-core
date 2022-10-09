package com.rakovets.course.java.core.practice.enum_types;

public class DemoEnum {
    public static void main(String[] args) {
        ShowMeSeasons favoriteSeasons = new ShowMeSeasons(SeasonEnum.SUMMER);

        favoriteSeasons.print(SeasonEnum.SUMMER);

        System.out.println(favoriteSeasons.favouriteSeason(SeasonEnum.SUMMER));
        System.out.println(favoriteSeasons.getDescription(SeasonEnum.SUMMER));
        favoriteSeasons.arraySeason();
    }
}
