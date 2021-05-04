package com.rakovets.course.java.core.practice.date_and_time.data_wrapper;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;

public class DataUtilDemo {
    public static void main(String[] args) throws ParseException {
        DataUtil dataUtil = new DataUtil();
        LocalDate time = DataUtil.getDate(2020, 10, 11);
        System.out.println(time);
        LocalDate time1 = DataUtil.plusMonths(time, 5);
        System.out.println(time1);
        System.out.println(DataUtil.getFormatLocalDateByString(LocalDate.now(), "MMMM-dd-yyyy"));
        System.out.println(DataUtil.getFormatStringDateByLocalDate("19/05/2009", "dd/MM/yyyy"));

        System.out.println(DataUtil.findTimeInDaysBetweenDates(LocalDate.now(),
                LocalDate.now().plusMonths(3).plusYears(1)));

        System.out.println(DataUtil.getDateJavaCalendar(2020, 10 ,11));
        System.out.println(DataUtil.plusMonths(new Date(), 15));
        System.out.println(DataUtil.getFormatDateByString(new Date(), "dd/MM/yyyy"));

        System.out.println(DataUtil.getStringDateByDate("19/05/2009", "dd/MM/yyyy"));
        System.out.println(DataUtil.findTimeInDaysBetweenDates(new Date(), DataUtil.plusMonths(new Date(), 15)));

        System.out.println(dataUtil.adjustInto(LocalDate.of(2001, 7, 2)));
        System.out.println(dataUtil.adjustInto(LocalDate.now(), 11));
    }
}
