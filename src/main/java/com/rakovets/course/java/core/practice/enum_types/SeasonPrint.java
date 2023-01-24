package com.rakovets.course.java.core.practice.enum_types;

public class SeasonPrint {
    public void printAll() {
        Seasons[] seasons = Seasons.values();
        Season season;

        for (Seasons value : seasons) {
            season = new Season(value);

            System.out.printf("%s\nAverage temperature: %s\n%s\nMy favorite season is Spring: %s\n\n",
                    season.getSeason(), season.getAverageTemperature(), season.getDescription(),
                    season.favoriteSeasonInfo());
        }
    }
}
