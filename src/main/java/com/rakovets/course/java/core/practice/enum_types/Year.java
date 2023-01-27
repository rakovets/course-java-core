package com.rakovets.course.java.core.practice.enum_types;

public class Year {
    public void printLoveSeasons(Seasons season) {
        String print = "";
        switch (season) {
            case SUMMER:
                print = "I love summer \n";
                break;
            case AUTUMN:
                print = "I love fall \n";
                break;
            case WINTER:
                print = "I love winter \n";
                break;
            case SPRING:
                print = "I love spring \n";
                break;
        }
        System.out.print(print);
    }

    public void printSeasonData() {
        for (Seasons s : Seasons.values()) {
            System.out.printf("%s %s %s \n", s, s.getMiddleTemperature(), s.getDescription());
        }
    }

    public void printInfoAboutSeason(Seasons season) {
        String print = "";
        switch (season) {
            case SUMMER:
                print = "Summer is one of the four seasons. It is the hottest season of the year. \n" +
                        "In some places, summer is the wettest season (with the most rain), and \n" +
                        "in other places, it is a dry season. Four seasons are found in areas \n" +
                        "which are not too hot or too cold. Summer happens to the north and \n" +
                        "south sides of the Earth at opposite times of the year. \n";
                break;
            case AUTUMN:
                print = "Autumn is the season after summer and before winter. In the \n" +
                        "United States this season is also called fall. In the Northern \n" +
                        "Hemisphere, it is often said to begin with the autumnal equinox \n" +
                        "in September and end with the winter solstice in December. In \n" +
                        "the Southern Hemisphere, it runs from the autumnal equinox in March \n" +
                        "to the winter solstice in June.\n";
                break;
            case WINTER:
                print = "Winter is one of the four seasons and the coldest time of the year. \n" +
                        "The days are shorter and the nights are longer. Winter comes after \n" +
                        "autumn and before spring. Winter begins at the winter solstice. In \n" +
                        "the Northern Hemisphere the winter solstice is usually December 21 \n" +
                        "or December 22. In the Southern Hemisphere the winter solstice is \n" +
                        "usually June 21 or June 22.";
                break;
            case SPRING:
                print = "Spring is the season after winter and before summer. Days become \n" +
                        "longer and weather gets warmer in the temperate zone because the \n" +
                        "Earth tilts relative to its orbital plane around the Sun. In many \n" +
                        "parts of the world it rains for hours. This helps the plants grow \n" +
                        "and flowers bloom.\n";
                break;
        }
        System.out.println(print);
    }
}
