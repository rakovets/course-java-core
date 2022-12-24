package com.rakovets.course.java.core.practice.decision_making_statements;

import java.io.Console;
import java.util.Scanner;

/**
 * Разработать программу для desktop приложения
 * которая выведет приветствии для пользователя в зависимости от времени суток.
 *
 * @author Dmitry Rakovets
 */
class Task02 {
       public static void main(String[] args) {
        int hour = 1;
        String greeting = getGreetingByHour(hour);
        System.out.printf("Result: %s", greeting);
    }
      static String getGreetingByHour(int hour) {
        String result = "";
        if (hour > 5 && hour <= 11) {
            result = "Good morning";
        }
        if (hour > 12 && hour <= 17) {
            result = "Good day";
        }
        if (hour > 17 && hour <= 23) {
            result = "Good evening";
        }
        if (hour >= 0 && hour <= 5) {
            result = "Good night";
        }
        return result;
    }
}
