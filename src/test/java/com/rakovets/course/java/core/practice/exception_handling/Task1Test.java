package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.example.exception_handling.exception.AccountException;
import com.rakovets.course.java.core.example.exception_handling.model.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task1Test {

    @Test
    void throwSomeExeption() {
        Executable actualExecutable = () -> Task1.throwSomeExeption();

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
