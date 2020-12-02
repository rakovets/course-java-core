package com.rakovets.course.javabasics.practice.dateandtype;

import com.rakovets.course.javabasics.util.AnsiColorCode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        LocalDate currentDate = DateWrapper.getLocaleDate(1981, 12, 05);
        LocalDate currentDate2 = DateWrapper.getLocaleDate(1983, 10, 07);

        System.out.println("Current Date  " + AnsiColorCode.FG_YELLOW_BOLD + currentDate + "\n" + AnsiColorCode.RESET);
        int n = 3;
        System.out.println("Current Date + " + n + " month " + AnsiColorCode.FG_YELLOW_BOLD +
                            DateWrapper.getLocaleDatePlusN(currentDate, n) + AnsiColorCode.RESET);

        String format = "dd / M / yyyy";
        String result = DateWrapper.getDateUsePattern(currentDate, format);
        System.out.println("\nCurrent Date with FormatePattern will be " + AnsiColorCode.FG_YELLOW_BOLD + result + AnsiColorCode.RESET);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy HH:mm");
        String date = "3 September, 2018 12:10";
        LocalDateTime resultDate = DateWrapper.getDateUsePatternString(date, formatter);
        System.out.println("\nCurrent Date with Pattern " + AnsiColorCode.FG_YELLOW_BOLD + resultDate.toString() + AnsiColorCode.RESET);

        System.out.println("\nCurrent Date Between  " + AnsiColorCode.FG_YELLOW_BOLD +
                             DateWrapper.getPeriodBetweenMonth(currentDate, currentDate2) + AnsiColorCode.RESET);

        TempAdj daysPlus = new TempAdj(n);
        LocalDate resultDate1 = daysPlus.adjustInto(currentDate);
        System.out.println("\nCurrent Date with Adjuster " + n + " will be " + AnsiColorCode.FG_YELLOW_BOLD + resultDate1 + AnsiColorCode.RESET);

    }
}
