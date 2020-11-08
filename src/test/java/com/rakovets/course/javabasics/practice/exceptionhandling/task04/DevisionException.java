package com.rakovets.course.javabasics.practice.exceptionhandling.task04;

public class DevisionException extends RuntimeException {

    int nums;
    String NewMessage;

    public DevisionException(String message, int nums) {
        super(message);
        this.nums = nums;
    }
}
