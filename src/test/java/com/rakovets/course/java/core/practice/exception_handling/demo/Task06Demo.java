package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task06;
import com.rakovets.course.java.core.practice.exception_handling.exception.AgeException;
import com.rakovets.course.java.core.practice.exception_handling.exception.EmailException;
import com.rakovets.course.java.core.practice.exception_handling.exception.PasswordException;

public class Task06Demo {
    public static void main(String[] args) {
        int age = 17;

        String password = "1245";
        String email = "qwerty.com";
        String getAccount;

        try {
            getAccount = Task06.checkAccount(age, password, email);
        } catch (EmailException | PasswordException e) {
            getAccount = e.getMessage();
        } catch (AgeException e) {
            getAccount = e.getMessage();
            e.printStackTrace();
        }
        System.out.println(getAccount);
    }
}
