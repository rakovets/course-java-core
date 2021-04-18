package com.rakovets.course.java.core.practice.exception_handling;

public class Task7Demo {
    public static void main(String[] args) {
        try {
            int result = Task7.willOrNot();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("testing of block finally");
        }
    }
}
