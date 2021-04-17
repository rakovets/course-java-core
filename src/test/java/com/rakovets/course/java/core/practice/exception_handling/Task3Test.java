package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task3Test {

        @Test
        void getYearOfBirth() {
            Executable actualExecutable = () -> Task3.YearOfBirth.getYearOfBirth(2021, -35);
            Assertions.assertThrows(Task3.AgeException.class, actualExecutable);
        }
}

