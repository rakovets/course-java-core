package com.rakovets.course.java.core.practice.enum_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MySeasonEnumTests {
    MySeasonEnum mySeasonEnum = MySeasonEnum.Зима;

    @Test
    public void constructorTest() {
        Assertions.assertEquals("Зима", mySeasonEnum.name());
    }

    @Test
    public void printDescriptionOfSeasonTest() {
        Assertions.assertEquals("холодное время года", mySeasonEnum.printDescriptionOfSeason());
    }

    @Test
    public void getAverageTemperatureOfSeason() {
        Assertions.assertEquals(-5, mySeasonEnum.getAverageTemperatureOfSeason());
    }
}
