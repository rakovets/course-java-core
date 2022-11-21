package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class ReflectionUtilsTests {
    ReflectionUtils reflectionUtils = new ReflectionUtils();
    static Student student = new Student("Judi", "McGail", 18);
    static Class<? extends Student> studentClass = student.getClass();

    static Stream<Arguments> provideArgumentsForGetFieldOfClass() throws NoSuchFieldException {
        return Stream.of(
                Arguments.of(studentClass, "name", studentClass.getDeclaredField("name")),
                Arguments.of(studentClass, "surname", studentClass.getDeclaredField("surname")),
                Arguments.of(studentClass, "age", studentClass.getDeclaredField("age"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetFieldOfClass")
    void testGetFieldOfClass(Class clazz, String fieldName, Field expected) {
        Field actual = reflectionUtils.getFieldOfClass(clazz, fieldName);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMethodOfClass() {
        Method method = reflectionUtils.getMethodOfClass(studentClass, "getName");

        Assertions.assertEquals("class java.lang.String", method.getReturnType().toString());
    }

    static Stream<Arguments> provideArgumentsForGetAllMethodOfClass() {
        return Stream.of(
                Arguments.of(studentClass, Arrays.toString(studentClass.getDeclaredMethods()))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetAllMethodOfClass")
    void testGetAllMethodOfClass(Class<?> clazz, String expected) {
        String actual = Arrays.toString(reflectionUtils.getAllMethodOfClass(clazz));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void runMethodToObject() {
        Method method = reflectionUtils.getMethodOfClass(studentClass, "getName");
        Assertions.assertEquals("Judi", reflectionUtils.runMethodToObject(method, student));
    }

    @Test
    void setFieldOfObject() {
        Field field = reflectionUtils.getFieldOfClass(studentClass, "surname");
        reflectionUtils.setFieldOfObject(field, student, "McFly");
        Method method = reflectionUtils.getMethodOfClass(studentClass, "getSurname");
        Assertions.assertEquals("McFly", reflectionUtils.runMethodToObject(method, student));
    }

    @Test
    void getMethodWithParameters() {
        Method method = reflectionUtils.getMethodWithParameters(studentClass, "updateAge", int.class);
        Assertions.assertEquals("int", method.getReturnType().toString());
        Assertions.assertEquals(1, method.getParameterCount());
    }

    @Test
    void runThisMethodWithArguments() {
        Method method = reflectionUtils.getMethodWithParameters(studentClass, "updateAge", int.class);
        Assertions.assertEquals(23, reflectionUtils.runThisMethodWithArguments(method, student, 5));
    }
}
