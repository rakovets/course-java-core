package com.rakovets.course.javabasics.practice.dateandtype;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateWrapperTest {
    private LocalDate firstDate;
    private LocalDate secondDate;
    private LocalDate thirdDate;
    private DateWrapper dw;
    private Date date1;
    private Date date2;
    private Calendar calendar;
    private DateFormat dateFormat;
    private Date date3;
    private String format;


    @BeforeEach
    void init() {
        dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        dw = new DateWrapper();
        firstDate = LocalDate.of(2020, 06, 23);
        secondDate = LocalDate.of(2020, 07, 05);
        thirdDate = LocalDate.of(2021, 01, 01);
        date1 = new GregorianCalendar(2020, 05, 23).getTime();
        date2 = new GregorianCalendar(2021, 05, 01).getTime();
        date3 = new GregorianCalendar(2020, 06,05).getTime();
        calendar = new GregorianCalendar(2021, 00,01);
        format = "dd-MM-yyyy";
    }
    @Test
    void getDateTest() {
        assertEquals(firstDate, dw.getDate(2020, 06, 23));
    }
    @Test
    void getDateCalendarTest() {
        assertEquals(date1, dw.getDateCalendar(2020, 06, 23));
    }
    @Test
    void getNextDateTest() {
        assertEquals("2021-06-01", dw.getNextDate(thirdDate, 5).toString());
        assertEquals(date2, dw.getNextDate(calendar, 5));
    }
    @Test
    void getDateFormatTest() {
        assertEquals("05-07-2020", dw.getDateFormat(secondDate, format));
        assertEquals("01-06-2021", dw.getDateFormat(date2, format));
        assertEquals("01-01-2021", dw.getDateFormat(calendar, format));
    }
    @Test
    void getLocalDateTest() {
        assertEquals(firstDate, dw.getLocalDate("23-06-2020", format));
    }
    @Test
    void getDateFromStringTest() {
        assertEquals(date1, dw.getDateFromString("23-06-2020", format));
    }
    @Test
    void getDaysBetweenDatesTest() {
        assertEquals(12, dw.getDaysBetweenDates(firstDate, secondDate));
        assertEquals(180, dw.getDaysBetweenDates(secondDate, thirdDate));
        assertEquals(343, dw.getDaysBetweenDates(date1, date2));
        assertEquals(12,dw.getDaysBetweenDates(date1, date3));
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
