package com.rakovets.course.javabasics.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {
    private static Student batman;
    private static Class<? extends Student> batmanClass;

    @BeforeEach
    void init(){
        batman = new Student("Bruse", "Wayne" ,30);
        batmanClass = batman.getClass();

    }

    @Test
    void getField() throws IllegalAccessException {
        Assertions.assertEquals("Bruse", REflectionUtil.getField(batmanClass, "name").get(batman));
        Assertions.assertEquals("Wayne", REflectionUtil.getField(batman.getClass(), "surname").get(batman));

    }
    @Test
    void getMethod() {
        Method method = REflectionUtil.getMethod(batmanClass, "getAge");
        Assertions.assertEquals("int", method.getReturnType().toString());
        Assertions.assertEquals(0, method.getParameterCount());
        method = REflectionUtil.getMethod(batmanClass, "getAge");
        Assertions.assertEquals("int", method.getReturnType().toString());
        Assertions.assertEquals(0, method.getParameterCount());
    }

    @Test
    void getAllMethods() {
        Assertions.assertTrue(Arrays.toString(REflectionUtil.getAllMethods(batmanClass)).contains("getAge"));
        Assertions.assertTrue(Arrays.toString(REflectionUtil.getAllMethods(batmanClass)).contains("getName"));
        System.out.println(Arrays.toString(REflectionUtil.getAllMethods(batmanClass)));
    }

    @Test
    void runMethod() {
        Method method = REflectionUtil.getMethod(batmanClass, "getAge");
        Assertions.assertEquals(30, REflectionUtil.runMethod(batman, method));
        method = REflectionUtil.getMethod(batmanClass, "getName");
        Assertions.assertEquals("Bruse", REflectionUtil.runMethod(batman, method));
    }

    @Test
    void setField() {
        Field field = REflectionUtil.getField(batmanClass, "name");
        REflectionUtil.setField(field, batman, "Bruses");
        Method method = REflectionUtil.getMethod(batmanClass, "getName");
        Assertions.assertEquals("Bruses", REflectionUtil.runMethod(batman, method));
        field = REflectionUtil.getField(batmanClass, "age");
        REflectionUtil.setField(field, batman, 30);
        method = REflectionUtil.getMethod(batmanClass, "getAge");
        Assertions.assertEquals(30, REflectionUtil.runMethod(batman, method));
    }
}
