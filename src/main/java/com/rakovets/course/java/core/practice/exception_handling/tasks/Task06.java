package com.rakovets.course.java.core.practice.exception_handling.tasks;

import com.rakovets.course.java.core.practice.exception_handling.exception.AgeException;
import com.rakovets.course.java.core.practice.exception_handling.exception.EmailException;
import com.rakovets.course.java.core.practice.exception_handling.exception.PasswordException;

public class Task06 {
    /**
     * Verifies account.
     * <li> E-mail must comply with the standard otherwise it will throw an error.
     * <li>The user cannot be under 18, otherwise it will throw an error.
     * <li> The password cannot be more than 15 digits otherwise it will give an error.
     *
     * @param age      user's age.
     * @param password user password.
     * @param email    user's email.
     * @return the text that the account was created.
     * @throws EmailException    if the email is entered incorrectly, it will display the error text.
     * @throws PasswordException if the password is entered incorrectly, an error text will be displayed.
     * @throws AgeException      when entering an age under 18, it displays the error text.
     */
    public String checkAccount(int age, String password, String email)
            throws EmailException, PasswordException, AgeException {
        int minimalAge = 18;
        int lengthPassword = 15;
        String emailCom = ".com";
        String accountCreate = "Account created!";

        email = email.trim();
        int length = password.length();

        if (!email.endsWith(emailCom)) {
            throw new EmailException("Invalid data input.");
        }
        if (age < minimalAge) {
            throw new AgeException("The user's age cannot be less than 18 years.");
        }
        if (length > lengthPassword) {
            throw new PasswordException("Invalid data input.");
        }
        return accountCreate;
    }
}
