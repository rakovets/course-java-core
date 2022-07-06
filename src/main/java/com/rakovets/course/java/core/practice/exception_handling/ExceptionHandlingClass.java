package com.rakovets.course.java.core.practice.exception_handling;

public class ExceptionHandlingClass {

    public void returnNullString() {
        try {
            String stringOne = null;
            stringOne.length();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void arrayOutOfBound() {
        try {
            int[] arr = new int[5];
            arr[6] = 1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

   public class Age {
        public static String checkAge(int num) throws AgeException {
            String result = "";
            if (num < 0) {
                throw new AgeException("The age is less than 0", num);
            }
            result = "Age is valid";
            return result;
        }
    }

    public class AgeException extends Exception {
        private int number;

        public AgeException(String message, int num) {
            super(message);
            number = num;
        }
    }
}
