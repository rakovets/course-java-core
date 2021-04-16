package com.rakovets.course.java.core.practice.exception_handling.task04;

public class WrongDividerException extends  RuntimeException {
    public WrongDividerException(){
        super("Wrong number");
    }
}
