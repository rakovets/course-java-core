package com.rakovets.course.javabasics.practice.dateandtype;

import static com.rakovets.course.javabasics.practice.dateandtype.DateWrapper.*;

public class DateWrapperDemo {
    public static void main(String[] args) {
        System.out.println(localDateReturn());
        System.out.println(localDateReturnInMonth(localDateReturn(), 5));
        System.out.println(LocalDateWithPattern(localDateReturn(), "MM d, yyyy"));
        System.out.println(PatternWithLocalDate(localDateReturn(), "MM d, yyyy"));
        System.out.println(daysOfDifference(localDateReturn(), localDateReturnInMonth(localDateReturn(), -1)));
        myTemporalAdjuster(13);
    }
}
