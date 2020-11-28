package com.rakovets.course.javabasics.practice.dateandtype;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateWrapperDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy.MM.dd");
        DateWrapper dw = new DateWrapper();
        System.out.println(dw.getDateFormat(localDate, formatter));

    }
}
