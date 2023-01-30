package com.rakovets.course.java.core.practice.exception_handling.task4;

import com.rakovets.course.java.core.practice.exception_handling.task4.exceptions.CustomRuntimeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class PersonAgeValidationTest {
    PersonAgeValidation personAgeValidation = new PersonAgeValidation();

    @DisplayName("Test of RuntimeExceptionException, throws Exception")
    @Test
    void callRuntimeExceptionTest() {
        Executable executable = () -> personAgeValidation.isAgeValid(19);

        Assertions.assertThrows(CustomRuntimeException.class, executable);
    }
}
