package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.exception.AgeException;
import com.rakovets.course.java.core.practice.exception_handling.exception.EmailException;
import com.rakovets.course.java.core.practice.exception_handling.exception.PasswordException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task06;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class Task06Test {
    Task06 task06 = new Task06();

    @Test
    void AgeException() {
        int age = 17;
        String password = "547578";
        String email = "qwerty@.com";

        Executable actualExecutable = () -> task06.checkAccount(age, password, email);

        Assertions.assertThrows(AgeException.class, actualExecutable);
    }

    @Test
    void EmailException() {
        int age = 18;
        String password = "547578";
        String email = "qwerty@.con";

        Executable actualExecutable = () -> task06.checkAccount(age, password, email);

        Assertions.assertThrows(EmailException.class, actualExecutable);
    }

    @Test
    void PasswordException() {
        int age = 18;
        String password = "547578456456456454646";
        String email = "qwerty@.com";

        Executable actualExecutable = () -> task06.checkAccount(age, password, email);

        Assertions.assertThrows(PasswordException.class, actualExecutable);
    }
}
