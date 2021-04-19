package com.rakovets.course.java.core.practice.exception_handling.task_07;

public class NumberChecker {
    public static int isEvenNumber(int number) throws NotEvenNumberException{
        if(number % 2 == 0) {
            System.out.print("Number is Even");
            } else {
                throw new NotEvenNumberException();
            }
        return number;
        }
    }

