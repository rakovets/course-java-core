package com.rakovets.course.java.core.example.enum_types;

import com.rakovets.course.java.core.example.enum_types.model.DayParentClass;

public class Example2WithClassHierarchy {
    public static void main(String[] args) {
        DayParentClass dayParentClass = DayParentClass.MONDAY;
        dayParentClass.print();
    }
}
