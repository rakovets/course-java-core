package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class DateWrapperDemo {
    public static void main(String[] args) {
        LocalDate date1 = DateWrapper.getLocalDate(2021, 5, 1);
        System.out.println(date1);

        LocalDate date2 = DateWrapper.getLocalDateWithChangedMonth(date1, 8);
        System.out.println(date2);

        String pattern = "MMMM, dd, yyyy";
        String dateString = DateWrapper.getStringWithDate(date2, pattern);
        System.out.println(dateString);

        String str = "May, 02, 2021";
        String pattern1 = "MMMM, dd, yyyy";
        LocalDate date3 = DateWrapper.makeLocalDateFromString(str, pattern1);
        System.out.println(date3);

        int days = DateWrapper.getNumberDayBetweenTwoDates(date1, date3);
        System.out.printf("Number days between two dates = %d\n", days);

        LocalDate date4 = date3.with(new DateCorrectionByDays(21));
        System.out.println(date4);

        LocalDate originalTime = LocalDate.of(2021, 5, 2);
        LocalDate date5 = originalTime.with(new DateCorrection());
        System.out.println(date5);
    }
}
