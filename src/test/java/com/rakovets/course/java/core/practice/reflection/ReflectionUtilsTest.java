package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

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
    void getArrayOfMethod() {
        Assertions.assertTrue(Arrays.toString(ReflectionUtils.getArrayOfMethod(Student.class)).contains("getName"));
        Assertions.assertTrue(Arrays.toString(ReflectionUtils.getArrayOfMethod(Student.class)).contains("getFee"));
        Assertions.assertTrue(Arrays.toString(ReflectionUtils.getArrayOfMethod(Student.class)).contains("plusFee"));
        Assertions.assertTrue(Arrays.toString(ReflectionUtils.getArrayOfMethod(Student.class)).contains("resetFee"));
    }

    @Test
    void startMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int expected = 0;

        ReflectionUtils.startMethod(Student.class.getDeclaredMethod("resetFee"), student);

        Assertions.assertEquals(expected, student.getFee());
    }

    @Test
    void setValueInField() throws NoSuchFieldException, IllegalAccessException {
        String expected = "Petya";

        ReflectionUtils.setValueInField(Student.class.getDeclaredField("name"), student, "Petya");

        Assertions.assertEquals(expected, student.getName());
    }

    @Test
    void getMethodWithParams() throws NoSuchMethodException {
        String expected = "plusFee";

        Method actual = ReflectionUtils.getMethodWithParams(Student.class, "plusFee", int.class);

        Assertions.assertEquals(expected, actual.getName());
    }

    @Test
    void startMethodWithArgs() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object[] params = new Object[]{50};
        int expected = 150;

        ReflectionUtils.startMethodWithArgs(Student.class.getDeclaredMethod("plusFee", int.class), student, params);

        Assertions.assertEquals(expected, student.getFee());
    }
}
