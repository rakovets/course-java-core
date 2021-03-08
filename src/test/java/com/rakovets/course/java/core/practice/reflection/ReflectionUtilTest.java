package com.rakovets.course.java.core.practice.reflection;

import com.rakovets.course.java.core.practice.reflection.model.Cat;
import com.rakovets.course.java.core.practice.reflection.reflection_utilities.ReflectionUtil;
import com.rakovets.course.java.core.practice.reflection.reflection_utilities.ReflectionUtilException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionUtilTest {
    Cat cat = new Cat("Garold", 5);
    Class<?> clazz = cat.getClass();

    @Test
    void getField() {
        try {
            Field actualField = ReflectionUtil.getField(clazz, "age");
            Assertions.assertEquals("age", actualField.getName());
        } catch (ReflectionUtilException rue) {
            System.out.println(rue.getMessage());
        }
    }

    @Test
    void getMethod() {
        try {
            Method actualMethod = ReflectionUtil.getMethod(clazz, "purr");
            Assertions.assertEquals("purr", actualMethod.getName());
        } catch (ReflectionUtilException rue) {
            System.out.println(rue.getMessage());
        }
    }

    @Test
    void getAllMethods() {
        try {
            Method[] actualMethods = ReflectionUtil.getAllMethods(clazz);
            List<String> actualMethodsNames = Arrays.stream(actualMethods).map(Method::getName).collect(Collectors.toList());
            Assertions.assertTrue(actualMethodsNames.contains("purr"));
            Assertions.assertTrue(actualMethodsNames.contains("feed"));
            Assertions.assertTrue(actualMethodsNames.contains("getAge"));
            Assertions.assertTrue(actualMethodsNames.contains("updateAge"));
        } catch (ReflectionUtilException rue) {
            System.out.println(rue.getMessage());
        }
    }

    @Test
    void invokeMethod() {
        try {
            Method method = ReflectionUtil.getMethod(clazz, "updateAge");
            Object actualObject = ReflectionUtil.invokeMethod(method, cat);
            Assertions.assertEquals(6, cat.getAge());
            Assertions.assertNull(actualObject);
        } catch (ReflectionUtilException rue) {
            System.out.println(rue.getMessage());
        }
    }

    @Test
    void setField() {
        try {
            Field field = ReflectionUtil.getField(clazz, "age");
            ReflectionUtil.setField(field, cat, 7);
            Assertions.assertEquals(7, cat.getAge());
        } catch (ReflectionUtilException rue) {
            System.out.println(rue.getMessage());
        }
    }

    @Test
    void getMethodWithFullSignature() {
        try {
            Method actualMethod = ReflectionUtil.getMethodWithFullSignature(clazz, "feed", String.class);
            Assertions.assertEquals("feed", actualMethod.getName());
        } catch (ReflectionUtilException rue) {
            System.out.println(rue.getMessage());
        }
    }

    @Test
    void invokeMethodWithParameters() {
        try {
            Method method = ReflectionUtil.getMethod(clazz, "feed");
            Object actualObject = ReflectionUtil.invokeMethodWithParameters(method, cat, "fish");
            Assertions.assertEquals("purr for fish", actualObject);
        } catch (ReflectionUtilException rue) {
            System.out.println(rue.getMessage());
        }
    }
}
