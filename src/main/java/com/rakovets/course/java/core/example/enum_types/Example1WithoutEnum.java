package com.rakovets.course.java.core.example.enum_types;

import com.rakovets.course.java.core.example.enum_types.model.DayStaticField;
import com.rakovets.course.java.core.example.enum_types.service.PrintServiceWithoutEnum;

public class Example1WithoutEnum {
    public static void main(String[] args) {
        String day = DayStaticField.MONDAY;

        PrintServiceWithoutEnum printServiceWithoutEnum = new PrintServiceWithoutEnum();
        printServiceWithoutEnum.print(day);
    }
}
