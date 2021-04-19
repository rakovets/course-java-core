package com.rakovets.course.java.core.practice.exception_handling;

import java.util.ArrayList;

public class Task04 {
    public static void phoneFinder(String model) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Nokia");
        arrayList.add("Samsung");

        if (!arrayList.contains(model)) {
            throw new PhoneNotAvailableException(model);
        } else {
            System.out.println(model);
        }
    }
}
