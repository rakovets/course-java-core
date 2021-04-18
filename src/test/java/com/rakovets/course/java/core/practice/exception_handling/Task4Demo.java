package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeptions.SecondExeption;

public class Task4Demo {
    public static void main(String[] args) {
        try {
            int result = Task4.areaOfScuare(0);
        }
        catch (SecondExeption ex){
            System.out.println(ex.getValue());
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
