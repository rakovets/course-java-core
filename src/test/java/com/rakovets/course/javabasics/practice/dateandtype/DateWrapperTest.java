package com.rakovets.course.javabasics.practice.dateandtype;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateWrapperTest {

    @Test
    void tests() {
        LocalDate date1 = DateWrapper.getLocalDate(2020,11,28);
        assertEquals("2020-11-28", date1.toString());
        LocalDate date2 = DateWrapper.getLocalDateAfter(date1, -3);
        assertEquals("2020-08-28", date2.toString());
        assertEquals("August 28, 2020", DateWrapper.getLocalDateOfFormat(date2, "MMMM d, yyyy"));
        assertEquals("November 28, 2020", DateWrapper.getLocalDateOfFormat("2020-11-28", "MMMM d, yyyy"));
        assertEquals(92, DateWrapper.getDays(date2, date1));
    }

}
