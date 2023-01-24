package com.rakovets.course.java.core.practice.exception_handling;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.AgeValidation;
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
    public void causeNullPointerExceptionTest() {
        Executable executable = () -> tasks.causeNullPointerException();

        Assertions.assertThrows(NullPointerException.class, executable);
    }
    @Test
    public void causeArrayIndexOutOfBoundsExceptionTest() {
        Executable executable = () -> tasks.causeArrayIndexOutOfBoundsException();

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, executable);
    }

    @Test
    public void causeMyCustomExceptionTest() {
        Executable executable = () -> tasks.causeMyCustomException(31);

        Assertions.assertThrows(DegreeOfAlcoholValidation.class, executable);
    }

    @Test
    public void causeMyCustomRuntimeExceptionTest() {
        Executable executable = () -> tasks.causeMyCustomRuntimeException(17);

        Assertions.assertThrows(AgeValidation.class, executable);
    }







}
