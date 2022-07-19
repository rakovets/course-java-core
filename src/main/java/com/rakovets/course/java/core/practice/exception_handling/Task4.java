package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CarNotAvailableException;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Volvo");
        arrayList.add("BMW");
        arrayList.add("Ford");
        arrayList.add("Porsche");

        String car = "Mazda";

        if (!arrayList.contains(car))
            try {
                throw new CarNotAvailableException(car);
            } catch (CarNotAvailableException e) {
                e.printStackTrace();
            }
        else System.out.println(car);
    }
}
