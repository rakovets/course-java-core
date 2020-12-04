package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;

public class TemporalAdjusterPlusFiveDaysDemo {
    public static void main(String[] args) {

        TemporalAdjusterPlusFiveDaysAndChangeToTheNearestFirstJanuary temporalAdjuster = new TemporalAdjusterPlusFiveDaysAndChangeToTheNearestFirstJanuary();
        LocalDate now = LocalDate.now();
        System.out.println(temporalAdjuster.adjustInto(now));
    }
}
