package com.rakovets.course.java.core.practice.enum_types;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSeasons {
    SeasonEnum springEnum = SeasonEnum.SPRING;
    SeasonEnum summerEnum = SeasonEnum.SUMMER;
    SeasonEnum winterEnum = SeasonEnum.WINTER;
    SeasonEnum autumnEnum = SeasonEnum.AUTUMN;

    @Test
    void weatherDescription() {
        // WHEN
        String actual1 = summerEnum.getDescription(SeasonEnum.SUMMER);
        String actual2 = springEnum.getDescription(SeasonEnum.SPRING);
        String actual3 = winterEnum.getDescription(SeasonEnum.WINTER);
        String actual4 = autumnEnum.getDescription(SeasonEnum.AUTUMN);

        //THEN
        Assertions.assertEquals("21 degree - Hot season", actual1);
        Assertions.assertEquals("12 degree - Warm season", actual2);
        Assertions.assertEquals("-7 degree - Cold season", actual3);
        Assertions.assertEquals("8 degree - Warm season", actual4);
    }

    @Test
    void seasonLike() {
        // WHEN
        String actual1 = summerEnum.findFavoriteSeason(SeasonEnum.SUMMER);
        String actual2 = springEnum.findFavoriteSeason(SeasonEnum.SPRING);
        String actual3 = winterEnum.findFavoriteSeason(SeasonEnum.WINTER);
        String actual4 = autumnEnum.findFavoriteSeason(SeasonEnum.AUTUMN);

        //THEN
        Assertions.assertEquals("I like summer", actual1);
        Assertions.assertEquals("I like spring", actual2);
        Assertions.assertEquals("I like winter", actual3);
        Assertions.assertEquals("I like autumn", actual4);
    }

    @Test
    void favoriteSeason() {
        // WHEN
        String actual1 = SeasonEnum.getMyFavoriteSeason(SeasonEnum.SUMMER);

        //THEN
        Assertions.assertEquals("I like summer", actual1);
    }
}



