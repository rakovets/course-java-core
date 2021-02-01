package com.rakovets.course.java.core.practice.exception_handling.model;

import com.rakovets.course.java.core.practice.exception_handling.exception.NullException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class Task_5_test {

    @Test
    void getNullPointerException() {
        //Given
        String expectedMessage = "You defined null.";
        String expectedDebugMessage =  "NullPointedException is catched.";

        //When
        Executable actualExecutable = () -> Task_5.getNullPointerException(null);

        //Than
        NullException actualException = Assertions.assertThrows(NullException.class, actualExecutable);
        Assertions.assertEquals(expectedMessage, actualException.getMessage());
        Assertions.assertEquals(expectedDebugMessage, actualException.getDebugMessage());
    }
}
