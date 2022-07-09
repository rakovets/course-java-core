package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task06;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task06Test {
    @Test
    void checkAccountFirstTest() {
        int age = 17;
        String password = "547578";
        String email = "qwerty@.com";

        Executable actualExecutable = () -> Task06.checkAccount(age, password, email);

        Assertions.assertThrows(Exception.class, actualExecutable);
    }

    @Test
    void checkAccountSecondTest() {
        int age = 18;
        String password = "547578";
        String email = "qwerty@.con";

        Executable actualExecutable = () -> Task06.checkAccount(age, password, email);

        Assertions.assertThrows(Exception.class, actualExecutable);
    }

    @Test
    void checkAccountThirdTest() {
        int age = 18;
        String password = "547578456456456454646";
        String email = "qwerty@.com";

        Executable actualExecutable = () -> Task06.checkAccount(age, password, email);

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
