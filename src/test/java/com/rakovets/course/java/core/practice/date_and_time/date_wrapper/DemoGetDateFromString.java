package com.rakovets.course.java.core.practice.date_and_time.date_wrapper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DemoGetDateFromString {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(DateWrapper.getDateFromString("01-07-2021", dateFormat));
    }
}
