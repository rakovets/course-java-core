package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.concurrent.Callable;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> city = List.of("Minsk","Vitebsk","Chicago","Minsk","Cancun","Barcelona","Madrid","Berlin");
        System.out.println("This is unique cities list" + CityHelper.getUniqueCities(city));
        System.out.println("These ara cities names,longer than 6 characters: " + CityHelper.getCitiesLongerThatNSymbols(city,6));
        System.out.println("Cities, starting with letter M: " + CityHelper.getCitiesStartingWithLetters(city,"M"));
        System.out.println("Number of repeating cities 'Minsk': " + CityHelper.getRepeatWordsInListCount(city,"Minsk"));

    }
}
