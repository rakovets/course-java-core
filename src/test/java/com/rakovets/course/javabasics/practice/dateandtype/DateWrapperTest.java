package com.rakovets.course.javabasics.practice.dateandtype;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateWrapperTest {
    private static LocalDate firstDate;
    private static LocalDate secondDate;
    private static LocalDate thirdDate;
    private static DateWrapper dw;
    @BeforeAll
    static void init() {
        firstDate = LocalDate.of(2020, 06, 23);
        secondDate = LocalDate.of(2020, 07, 05);
        thirdDate = LocalDate.of(2021, 01, 01);
        dw = new DateWrapper();
    }
    @Test
    void getDaysBetweenDatesTest() {
        assertEquals(12, dw.getDaysBetweenDates(firstDate, secondDate));
        assertEquals(180, dw.getDaysBetweenDates(secondDate, thirdDate));
    }
    @Test
    void changeDateTest() {
        assertEquals("2020-07-19", dw.changeDate(secondDate, 14).toString());
        assertEquals("2020-06-30", dw.changeDate(firstDate,7).toString());
    }
    @Test
    void changeDateToNearest1stJanuaryTest() {
        assertEquals("2020-01-01", dw.changeDateToNearest1stJanuary(firstDate).toString());
        assertEquals("2021-01-01", dw.changeDateToNearest1stJanuary(secondDate).toString());
    }
}
