package com.rakovets.course.javabasics.practice.dateandtype;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DateWrapperTest {
    private DateWrapper dateWrapper;
    private LocalDate firstDate;
    private LocalDate secondDate;
    private Date firstDateInCalendar;
    private Calendar calendar;
    private String dateFormat;
    private Date firstDateByPattern;
    private LocalDate secondDateByPattern;
    private LocalDate thirdDate;

    @BeforeEach
    void init() {
        dateWrapper = new DateWrapper();
        dateFormat = "dd-MM-yyyy";
        firstDate = LocalDate.of(1000, 10, 10);
        secondDate = LocalDate.of(1000, 12, 10);
        thirdDate = LocalDate.of(1000,12,23);
        firstDateInCalendar = new GregorianCalendar(1000, 12, 10).getTime();
        firstDateByPattern = new GregorianCalendar(1000,10,10).getTime();
        secondDateByPattern = LocalDate.of(1000,10,10);
        calendar = new GregorianCalendar(1000, 10,10);
    }

    @Test
    void getLocalDateTest() {
        assertEquals(firstDate, dateWrapper.getLocalDate(1000, 10, 10));
    }

    @Test
    void getDateAfterPeriodTest() {
        assertEquals("1000-10-10", dateWrapper.getDateAfterPeriod(secondDate, -2).toString());
        assertEquals(firstDateInCalendar, dateWrapper.getDateAfterPeriod(calendar, 2));
    }

    @Test
     void getDateByPatternTest() {
        assertEquals("10-11-1000", dateWrapper.getDateByPattern(firstDateByPattern, dateFormat));
        assertEquals("10-10-1000", dateWrapper.getDateByPattern(secondDateByPattern, dateFormat));
        assertEquals("10-11-1000", dateWrapper.getDateByPattern(calendar,dateFormat));
    }

    @Test
    void  getDateTest() {
        assertEquals(firstDate, dateWrapper.getDate("10-10-1000", dateFormat));
    }

    @Test
    void getDifferenceBetweenLocalDateTest() {
        assertEquals(13, dateWrapper.getDifferenceBetweenLocalDate(secondDate, thirdDate));
    }

    @Test
    void getDateAfterNDaysTest() {
        assertEquals("1000-10-24", dateWrapper.getDateAfterNDays(firstDate, 14).toString());
    }

}
