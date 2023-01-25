package com.rakovets.course.java.core.practice.exception_handling;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomRuntimeException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.DegreeOfAlcoholValidation;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Tasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class TasksTests {
    Tasks tasks;

    @BeforeEach
    public void init() {
        tasks = new Tasks();
    }
    @Test
    public void callNullPointerExceptionTest() {
        Executable executable = () -> tasks.callNullPointerException();

        Assertions.assertThrows(NullPointerException.class, executable);
    }
    @Test
    public void callArrayIndexOutOfBoundsExceptionTest() {
        Executable executable = () -> tasks.callArrayIndexOutOfBoundsException();

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, executable);
    }

    @Test
    public void callMyCustomExceptionTest() {
        Executable executable = () -> tasks.callDegreeOfAlcoholValidation(31);

        Assertions.assertThrows(DegreeOfAlcoholValidation.class, executable);
    }

    @Test
    public void callMyCustomRuntimeExceptionTest() {
        Executable executable = () -> tasks.callMyCustomRuntimeException(17);

        Assertions.assertThrows(CustomRuntimeException.class, executable);
    }

    @Test
    public void catchArrayIndexOutOfBoundsExceptionTest() {
        Executable executable = () -> tasks.catchArrayIndexOutOfBoundsException();

        Assertions.assertThrows(CustomRuntimeException.class, executable);
    }







}
