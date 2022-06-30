package com.rakovets.course.java.core.practice.enum_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeasonsInfoTest {

    @Test
    public void testGetSeasonDescriptionSummer() {
        Assertions.assertEquals("Warm season", SeasonInfo.SUMMER.getSeasonDescription());
    }

    @Test
    public void testGetSeasonDescriptionWinter() {
        Assertions.assertEquals("Cold season", SeasonInfo.WINTER.getSeasonDescription());
    }

    @Test
    public void testGetSeasonDescriptionSpring() {
        Assertions.assertEquals("Cold season", SeasonInfo.SPRING.getSeasonDescription());
    }

    @Test
    public void testGetSeasonDescriptionAutumn() {
        Assertions.assertEquals("Cold season", SeasonInfo.AUTUMN.getSeasonDescription());
    }

    @Test
    public void testPrintTheSeasonInfo() {
        for (SeasonInfo s : SeasonInfo.values()) {
            s.printTheSeasonInfo();
        }
    }
}
