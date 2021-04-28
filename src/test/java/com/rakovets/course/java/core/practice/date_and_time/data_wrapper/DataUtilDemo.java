package com.rakovets.course.java.core.practice.date_and_time.data_wrapper;
import java.time.LocalDate;

public class DataUtilDemo {
    public static void main(String[] args) {
        LocalDate time = DataUtil.getDate(2020, 10, 11);
        System.out.println(time);

        LocalDate time1 = DataUtil.rewindMonth(time, 5);
        System.out.println(time1);
        System.out.println(DataUtil.isPatternDate(LocalDate.now(), "MMMM-dd-yyyy"));
        System.out.println(DataUtil.isPatternDate("19/05/2009", "dd/MM/yyyy"));

        System.out.println(DataUtil.isTimeInterval(LocalDate.now(), LocalDate.now().plusMonths(3).plusYears(1)));
    }
}
