package com.rakovets.course.java.core.practice.exception_handling;

public class Task7 {

    static class MakingException {
        public static void throwingException(int result) throws MyException {
            if (result > 50 && result <= 100) {
                throw new MyException("The number from 50 to 100!");
            }
        }
    }

    static class MyException extends Exception {
        public MyException(String message){
            super(message);
        }
    }
}
