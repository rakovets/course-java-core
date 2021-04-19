package com.rakovets.course.java.core.practice.exception_handling.task_06;

public class InvalidNumber extends Exception{
    public InvalidNumber(){
        super("Invalid number to divide");
    }
}
