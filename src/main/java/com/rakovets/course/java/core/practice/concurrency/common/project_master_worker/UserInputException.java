package com.rakovets.course.java.core.practice.concurrency.common.project_master_worker;

public class UserInputException extends Exception{
    UserInputException(String warning){
        super(warning);
    }
}
