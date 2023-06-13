package com.rakovets.course.java.core.practice.enum_types;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeasonTest {

    @Test
    void getTestAvgTemp()  {
        assertEquals(0, Season.WINTER.getAvgTemp());
        assertEquals(15, Season.SPRING.getAvgTemp());
        assertEquals(25, Season.SUMMER.getAvgTemp());
        assertEquals(10, Season.AUTUMN.getAvgTemp());
    }
    @Test
    void getTestSeasonDescription() {
        Season season = Season.AUTUMN;
        switch (season) {
            case WINTER:
                assertEquals("Cold", season.getDescription());
                break;
            case SPRING:
                assertEquals("Warm", season.getDescription());
                break;
            case SUMMER:
                assertEquals("Warm season", season.getDescription());
                break;
            case AUTUMN:
                assertEquals("Not bad", season.getDescription());
                break;
        }
    }
    @Test
    public void testSeasonDescriptionOverride() {
        assertEquals("Warm season", Season.SUMMER.getDescription());
        assertEquals("Cold", Season.WINTER.getDescription());
    }
}
