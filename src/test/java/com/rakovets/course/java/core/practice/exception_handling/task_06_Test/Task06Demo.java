package com.rakovets.course.java.core.practice.exception_handling.task_06_Test;

import com.rakovets.course.java.core.practice.exception_handling.task_06.InvalidNumber;
import com.rakovets.course.java.core.practice.exception_handling.task_06.Task06;

public class Task06Demo {
    public static void main(String[] args) {
        int[] ar = new int[3];
        int position = 2;
        int number = 3;
        int divider = 5;
        try{
            Task06.arrayOperations(ar, position,number,divider);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException a) {
            System.out.println("Check inputed data");
        } catch (InvalidNumber i){
            System.out.println(i.getMessage());
        }
    }
}
