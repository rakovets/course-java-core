package com.rakovets.course.java.core.practice.enum_types;

public class SeasonPrint {
    public void printAll() {
        Seasons[] seasons = Seasons.values();
        Season season;

        for (Seasons value : seasons) {
            season = new Season(value);

            System.out.printf("%s\n Average temperature: %s\n My favorite season is Spring: %s",
                    season.getSeason(), season.getDescription(), season.favoriteSeasonInfo());
        }
    }
}
