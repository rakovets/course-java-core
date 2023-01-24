package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.exception.EmptyStringException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task05;

public class Task05Demo {
    public static void main(String[] args){
        String charString;

        try {
            charString = Task05.getCharAt(null);
        } catch (EmptyStringException e) {
            charString = e.getMessage();
            e.printStackTrace();
        }
        System.out.println(charString);
    }
}
