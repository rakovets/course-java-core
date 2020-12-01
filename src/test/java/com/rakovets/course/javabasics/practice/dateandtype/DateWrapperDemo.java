package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import static java.lang.System.*;

public class DateWrapperDemo {
    public static void main(String[] args) {
        LocalDate localDate = DateWrapper.getLocalDate(2020,11,28);
        out.println(localDate);
        LocalDate localDate2 = DateWrapper.getLocalDateAfter(localDate, -3);
        out.println(localDate2);
        out.println(DateWrapper.getLocalDateOfFormat(localDate2, "MMMM d, yyyy"));
        out.println(DateWrapper.getLocalDateOfFormat("2020-11-28", "MMMM d, yyyy"));
        out.println(DateWrapper.getDays(localDate, localDate2));
    }
}
