package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import com.rakovets.course.java.core.practice.date_and_time.date_wrapper.Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class DateWrapperTest {

    @Test
    void getLocalDateTest() {
        LocalDate localDate = Task1.getLocalDate(2021, 5, 9);

        assertEquals("2021-05-09", localDate.toString());
    }

    @Test
    void getLocalDateAddMonthsTest() {
        LocalDate localDate = Task1.getLocalDate(2021, 5, 9);
        LocalDate localDate1 = Task1.getLocalDateAddMonths(localDate, 5);

        assertEquals("2021-10-09", localDate1.toString());
    }

    @Test
    void getStringDatePaternTest() {
        LocalDate localDate = Task1.getLocalDate(2021, 5, 9);

        assertEquals("9.5.2021", Task1.getStringDatePatern(localDate));
    }

    @Test
    void getLocalDateFormatTest() {
        assertEquals("2021-05-09", Task1.getLocalDateFormat("9.5.2021", "d.M.yyyy").toString());
    }

    @Test
    void daysBetweenTest() {
        LocalDate localDate1 = Task1.getLocalDate(2021, 5, 9);
        LocalDate localDate2 = Task1.getLocalDate(2021, 12, 10);

        assertEquals(215, Task1.daysBetween(localDate1, localDate2));
    }

    @Test
    void getTemporalAdjusterAddDaysTest() {
        LocalDate localDate = Task1.getLocalDate(2021, 5, 9);

        assertEquals("2021-08-17", Task2.getTemporalAdjusterAddDays(100).adjustInto(localDate).toString());
    }

    @Test
    void getNearFirstJenuaryTest() {
        LocalDate localDate = Task1.getLocalDate(2021, 7, 2);
        assertEquals("2021-01-01", Task2.getNearFirstJenuary(localDate).adjustInto(localDate).toString());

        LocalDate localDate1 = Task1.getLocalDate(2021, 7, 3);
        assertEquals("2022-01-01", Task2.getNearFirstJenuary(localDate1).adjustInto(localDate1).toString());
    }
}
