package com.rakovets.course.java.core.practice.exception_handling.task_06;

public class Task06 {

    public  static int arrayOperations(int[] ar, int position, int number, int divider) throws InvalidNumber{
        ar[position] = number / divider;
        if(number % 2 !=0){
            throw new InvalidNumber();
        }
        return ar[position];
    }
}
