package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionUtilsTest {

    Student student = new Student("Vasya", 100);

    @Test
    void getField() throws NoSuchFieldException {
        String expected = "name";

        Field actual = ReflectionUtils.getField(Student.class, "name");

        Assertions.assertEquals(expected, actual.getName());
    }

    @Test
    void getMethod() throws NoSuchMethodException {
        String expected = "getName";

        Method actual = ReflectionUtils.getMethod(Student.class, "getName");

        Assertions.assertEquals(expected, actual.getName());
    }

    @Test
    void getArrayOfMethod() throws NoSuchMethodException {
        Method[] expected = new Method[3];
        expected[0] = ReflectionUtils.getMethod(Student.class, "getName");
        expected[1] = ReflectionUtils.getMethod(Student.class, "getFee");
        expected[2] = ReflectionUtils.getMethod(Student.class, "plusFee");

        Method[] actual = ReflectionUtils.getArrayOfMethod(Student.class);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void startMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int expected = 110;

        ReflectionUtils.startMethod(Student.class.getDeclaredMethod("plusFee"), student);

        Assertions.assertEquals(expected, student.getFee());
    }

    @Test
    void setValueInField() throws NoSuchFieldException, IllegalAccessException {
        String expected = "Petya";

        ReflectionUtils.setValueInField(Student.class.getDeclaredField("name"), student, "Petya");

        Assertions.assertEquals(expected, student.getName());
    }
}
