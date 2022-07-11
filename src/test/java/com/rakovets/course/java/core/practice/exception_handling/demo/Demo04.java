package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task04;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.isEmptyException;

public class Demo04 {
    public static void main(String[] args) {
        Task04 task04 = new Task04("Error! Its empty!");
        int countOfBullets = 0;
        String result;
        try {
            result = task04.isEmpty(countOfBullets);
        } catch (isEmptyException e) {
            e.printStackTrace();
            result = e.getMessage();
        }
        System.out.println(result);
    }
}
