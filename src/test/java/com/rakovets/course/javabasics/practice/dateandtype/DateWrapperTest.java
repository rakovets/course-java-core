package com.rakovets.course.javabasics.practice.dateandtype;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateWrapperTest {

    @Test
    void task1() {
        LocalDate date1 = DateWrapper.getLocalDate(2020,11,28);
        assertEquals("2020-11-28", date1.toString());

        LocalDate date2 = DateWrapper.getLocalDateAfter(date1, -3);
        assertEquals("2020-08-28", date2.toString());

        assertEquals("August 28, 2020", DateWrapper.getLocalDateOfFormat(date2, "MMMM d, yyyy"));
        assertEquals("November 28, 2020", DateWrapper.getLocalDateOfFormat("2020-11-28", "MMMM d, yyyy"));
        assertEquals(92, DateWrapper.getDays(date2, date1));
    }

    @Test
    void task2() {
        LocalDate date = LocalDate.of(2020,12,2);
        int n = 30;
        assertEquals("2021-01-01", date.with(DateWrapper.plusDays(n)).toString());

        assertEquals("2020-01-01", LocalDate.of(2020, 7, 1).with(DateWrapper.nearestFirstDayOfYear()).toString());
        assertEquals("2021-01-01", LocalDate.of(2020, 7, 2).with(DateWrapper.nearestFirstDayOfYear()).toString());
    }

    @Test
    void task3() {
        Date date1 = new Date(1606918520000L);
        assertEquals("Wed Dec 02 17:15:20 MSK 2020", date1.toString());
        LocalDate date2 = DateWrapper.getLocalDateAfter(date1, -3);
        assertEquals("2020-09-02", date2.toString());
        assertEquals("December 2, 2020", DateWrapper.getLocalDateOfFormat(date1, "MMMM d, yyyy"));

        Calendar calendar = new GregorianCalendar(){
            @Override
            public String toString() {
                return YEAR + "-" + MONTH + "-" + DAY_OF_MONTH;
            }
        };

    }
}
