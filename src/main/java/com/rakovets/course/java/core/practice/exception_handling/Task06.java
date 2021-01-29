package com.rakovets.course.java.core.practice.exception_handling;

public class Task06 {
    public static void main(String[] args) {
        try {
            getRandomException();
        } catch (Exception ex) {
            if (ex.getMessage() == "Exception 3") {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            } else {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void getRandomException() throws Exception{
        double i = Math.random();
        if (i > 0 && i <= 0.3) {
            throw new Exception("Exception 1");
        } else if (i > 0.3 && i <= 0.7) {
            throw new Exception("Exception 2");
        } else {
            throw new Exception("Exception 3");
        }
    }
}
