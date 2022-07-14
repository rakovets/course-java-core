package com.rakovets.course.java.core.practice.exception_handling.demo;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task06;
import com.rakovets.course.java.core.practice.exception_handling.exception.AgeException;
import com.rakovets.course.java.core.practice.exception_handling.exception.EmailException;
import com.rakovets.course.java.core.practice.exception_handling.exception.PasswordException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task06Demo {
    private static final Logger logger = Logger.getLogger(Task06Demo.class.getName());

    public static void main(String[] args) {
        Task06 task06 = new Task06();

        int age = 17;

        String password = "1245";
        String email = "qwerty.com";

        try {
            System.out.println(task06.checkAccount(age, password, email));
        } catch (EmailException | PasswordException e) {
            logger.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();
        } catch (AgeException e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
    }
}
