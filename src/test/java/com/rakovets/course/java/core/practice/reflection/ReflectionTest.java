package com.rakovets.course.java.core.practice.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionTest {
    Point point = new Point(4.5, 2.5);

    @Test
    void getFieldTest() {
        try {
            Field actualField = ReflectionUtils.getField(point.getClass(), "x");
            Assertions.assertEquals("x", actualField.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void getMethodTest() {
        try {
            Method actualMethod = ReflectionUtils.getMethod(point.getClass(), "getX");
            Assertions.assertEquals("getX", actualMethod.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void getAllMethodsTest() {
        try {
            Method[] methods = ReflectionUtils.getAllMethods(point.getClass());
            List<String> actualMethods = Arrays.stream(methods)
                    .map(Method::getName)
                    .sorted()
                    .collect(Collectors.toList());

            List<String> expectedMethods = new ArrayList<>(Arrays.asList("getDistance", "getX", "getY", "setX",  "setY"));

            Assertions.assertEquals(expectedMethods, actualMethods);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void invokeMetodTest() {
        try {
            Method method = ReflectionUtils.getMethod(point.getClass(), "getDistance");
            Object actualObject = ReflectionUtils.invokeMetod(method, point);
            Assertions.assertEquals(5, point.getX());
            Assertions.assertNull(actualObject);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void setFieldTest() {
        try {
            Field field = ReflectionUtils.getField(point.getClass(), "x");
            ReflectionUtils.setField(field, point, 6);
            Assertions.assertEquals(6, point.getX());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void getMethodParametrsTest() {
        try {
            Method actualMethod = ReflectionUtils.getMethodParametrs(point.getClass(), "getX", Double.class);
            Assertions.assertEquals("getX", actualMethod.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void invokeMethodObjectTest() {
        try {
            Method method = ReflectionUtils.getMethod(point.getClass(), "getX");
            String actualObject = (String) ReflectionUtils.invokeMethodObject(method, point, 5);
            Assertions.assertEquals("4.55", actualObject);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
