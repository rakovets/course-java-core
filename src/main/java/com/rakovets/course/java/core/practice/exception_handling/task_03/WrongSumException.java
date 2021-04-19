package com.rakovets.course.java.core.practice.exception_handling.task_03;

public class WrongSumException extends Exception {

    public WrongSumException(){
        super("Wrong sum was inputed");
    }
}
