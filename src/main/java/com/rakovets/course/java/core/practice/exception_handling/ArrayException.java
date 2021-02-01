package com.rakovets.course.java.core.practice.exception_handling;

public class ArrayException extends RuntimeException{
    private String houses;

    public ArrayException(String houses) {
        this.houses = houses;
    }
    public String toString() {
        return "This " + houses + " is empty";
    }
}
