package com.rakovets.course.java.core.practice.exception_handling.Task4;

public class Task4 {
    final int MIN_AGE = 14;

        public void openSecuritiesAccount(int personAge) {
            if (personAge < MIN_AGE) {
               throw new Task4Exception("Sorry! You are not allowed to open a securities account!");
            }
        }
}
