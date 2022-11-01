package com.rakovets.course.java.core.practice.date_and_time.project_task_01;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Logger;

public class DemoTask01 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask01.class.getName());
        DateAndTimeUtilities dtu = new DateAndTimeUtilities();

        try {
            LocalDate localDate = dtu.getLocalDate(2022, 11, 1);
            logger.info(localDate.toString());
        } catch (DateTimeException e) {
            logger.info("Вы неправильно ввели дату");
            logger.warning(e.getMessage());
        }

        try {
            LocalDate localDate = LocalDate.of(2022, 11, 2);
            LocalDate localDate1 = dtu.getLocalDatePlusNMonths(localDate, 3);
            logger.info(localDate1.toString());
        } catch (DateTimeException e) {
            logger.info("Вы неправильно ввели дату");
            logger.warning(e.getMessage());
        }

        try {
            LocalDate localDate = LocalDate.of(2022, 11, 2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy", Locale.US);
            String localDateFormatted = dtu.getDateFormatted(localDate, formatter);
            logger.info(localDateFormatted);
        } catch (DateTimeException e) {
            logger.info("Вы неправильно ввели дату или направильно указали формат даты в строке паттерна");
            logger.warning(e.getMessage());
        }

        try {
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yy", Locale.US);
            LocalDate localDate2 = dtu.getLocalDateByStringAndFormatter("01-10-21", formatter2);
            logger.info(localDate2.toString());
        } catch (DateTimeException e) {
            logger.info("Вы неправильно ввели дату или направильно указали формат даты в строке");
            logger.warning(e.getMessage());
        }

        try {
            LocalDate localDate1 = LocalDate.of(2021, 10, 1);
            LocalDate localDate2 = LocalDate.of(2022, 11, 2);
            Period period = dtu.getPeriodBetweenTwoLocaleDate(localDate1, localDate2);
            logger.info(period.toString());
        } catch (DateTimeException e) {
            logger.info("Вы неправильно ввели дату");
            logger.warning(e.getMessage());
        }
    }
}
