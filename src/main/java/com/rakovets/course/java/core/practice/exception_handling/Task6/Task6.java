package com.rakovets.course.java.core.practice.exception_handling.Task6;

import com.rakovets.course.java.core.practice.exception_handling.Task4.Task4Exception;

public class Task6 {
    private final int MIN_AGE = 14;

    public void openSecuritiesAccount(int age, boolean bankClient, String login) {

       if (age < MIN_AGE) {
           throw new Task4Exception("Sorry! You are not allowed to open this type of account!");
       }
       if (!bankClient) {
           throw new Task6Exception("Sorry! You are not a customer of the bank! First you need to open a bank account!");
       }
       if (login.length() < 6) {
           throw new Task6LoginException("Sorry! You have to use more symbols for you login");
       }
    }
}
