package com.rakovets.course.java.core.practice.enum_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SeasonTest {
    static private Season season;
    private String result;
    private String expected;

    @BeforeAll
    static void initAll() {
        season = new Season(Seasons.SPRING);
    }

    @DisplayName("Test favoriteSeasonInfo(), returns String with info about my favorite season, Spring")
    @Test
    void printFavoriteSeasonInfoTest() {
        result = season.favoriteSeasonInfo();
        expected = "Spring is a transition season between the winter and summer seasons. The days get \n" +
                "longer and nights get shorter, the temperatures are milder, and flowers bloom. There is a warm \n" +
                "wind in the spring season in the air. Spring typically begins in March and usually lasts until \n" +
                "May or June.";

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test printFavoriteSeason(), returns String 'I like Spring!'")
    @Test
    void printFavoriteSeasonTest() {
        result = season.printFavoriteSeason(season.getFAVORITE_SEASON());
        expected = "I like Spring!";

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test getDescription() for Spring")
    @Test
    void getDescriptionTest1() {
        result = season.getDescription();
        expected = "It's cold time of year.";

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test getDescription() for Summer")
    @Test
    void getDescriptionTest2() {
        Season seasonSummer = new Season(Seasons.SUMMER);

        result = seasonSummer.getDescription();
        expected = "It's hot time of year.";

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test getDescription() for Winter")
    @Test
    void getDescriptionTest3() {
        Season seasonSummer = new Season(Seasons.WINTER);

        result = seasonSummer.getDescription();
        expected = "It's cold time of year.";

        Assertions.assertEquals(expected, result);
    }
}
