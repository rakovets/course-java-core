package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

class DateWrapperDemo {
    public static void main(String[] args) {

        LocalDate localDate = DateWrapper.getLocalDate(2020, 7, 1);
        System.out.println(DateWrapper.firstJanuary(localDate).adjustInto(localDate));
        LocalDate localDate1 = DateWrapper.getLocalDate(2020, 2, 1);
        System.out.println(DateWrapper.firstJanuary(localDate1).adjustInto(localDate1));
        LocalDate localDate2 = DateWrapper.getLocalDate(2020, 6, 1);
        System.out.println(DateWrapper.firstJanuary(localDate2).adjustInto(localDate2));
        LocalDate localDate3 = DateWrapper.getLocalDate(2020, 3, 1);
        System.out.println(DateWrapper.firstJanuary(localDate3).adjustInto(localDate3));
    }
}
