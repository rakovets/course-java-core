package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exeptions.FirtsExeption;

public class Task3Demo {
    public static void main(String[] args) {
        try {
            int result = Task3.getOdd(8);
            System.out.println(result);
        }
        catch (FirtsExeption ex){
            System.out.println(ex.getNumber());
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
