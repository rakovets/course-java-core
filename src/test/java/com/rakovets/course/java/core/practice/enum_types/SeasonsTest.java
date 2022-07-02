package com.rakovets.course.java.core.practice.enum_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeasonsTest {

    @Test
    public void testPrintFavouriteSeason() {
        Seasons favouriteSeason = Seasons.SUMMER;
        System.out.println(Seasons.getFavouriteSeason(favouriteSeason));
    }

    @Test
    public void testDetermineFavouriteSeasonSummer() {
        Assertions.assertEquals("I love summer", Seasons.determineFavouriteSeason(Seasons.SUMMER));
    }

    @Test
    public void testDetermineFavouriteSeasonWinter() {
        Assertions.assertEquals("I love winter", Seasons.determineFavouriteSeason(Seasons.WINTER));
    }

    @Test
    public void testDetermineFavouriteSeasonAutumn() {
        Assertions.assertEquals("I love autumn", Seasons.determineFavouriteSeason(Seasons.AUTUMN));
    }

    @Test
    public void testDetermineFavouriteSeasonSpring() {
        Assertions.assertEquals("I love spring", Seasons.determineFavouriteSeason(Seasons.SPRING));
    }

    @Test
    public void testGetDescriptionSummer() {
        Assertions.assertEquals("Warm season", Seasons.SUMMER.getDescription());
    }

    @Test
    public void testGetDescriptionWinter() {
        Assertions.assertEquals("Cold season", Seasons.WINTER.getDescription());
    }

    @Test
    public void testGetDescriptionSpring() {
        Assertions.assertEquals("Cold season", Seasons.SPRING.getDescription());
    }

    @Test
    public void testGetDescriptionAutumn() {
        Assertions.assertEquals("Cold season", Seasons.AUTUMN.getDescription());
    }

    @Test
    public void testPrintTheSeasonInfo() {
        Seasons.printTheSeasonInfo();
    }
}
