package com.rakovets.course.java.core.practice.exception_handling;

public class Task6 {
    static class MakingException {
        public static void throwingException(int result) throws MyFirstException, MySecondException, MyThirdException {
            if (result >= 0 && result < 33) {
                throw new MyFirstException("The number from 0 to 33!");
            }
            if (result >= 33 && result < 66) {
                throw new MySecondException("The number from 33 to 66!");
            }
            if (result >= 66 && result <= 100) {
                throw new MyThirdException("The number from 66 to 100!");
            }
        }
    }

    static class MyFirstException extends Exception{
        public MyFirstException(String message){
            super(message);
        }
    }

    static class MySecondException extends Exception{
        public MySecondException(String message){
            super(message);
        }
    }

    static class MyThirdException extends Exception{
        public MyThirdException(String message){
            super(message);
        }
    }
}
