package com.rakovets.course.java.core.practice.enum_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.List;

public class SeasonsTest {
    SeasonsUtil seasonsUtil;

    @BeforeEach
    public void instanceSeasonsUtil() {
        seasonsUtil = new SeasonsUtil();
    }

    @Test
    public void myFavoriteSeasonTest() {
        Seasons myFavoriteSeason = Seasons.WINTER;
        String myFavoriteSeasonMessage = seasonsUtil.getSeasonType(myFavoriteSeason);

        Assertions.assertEquals("I love winter", myFavoriteSeasonMessage);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test_data/middleTemperatureAndDescriptionForAllSeasons.csv", numLinesToSkip = 1)
    public void middleTemperatureAndDescriptionForAllSeasons(ArgumentsAccessor argumentsAccessor) {
        List<Seasons> seasons = Arrays.asList(Seasons.values());

        String actualResult;
        for (int i = 0; i < Seasons.values().length; i++) {
            actualResult = (String.format(
                    "Season %s - Middle temperature: %s and Description: %s",
                    seasons.get(i), seasons.get(i).getMiddleTemperature(), seasons.get(i).getDescription()));
            Assertions.assertEquals(argumentsAccessor.get(i), actualResult);
        }
    }
}
