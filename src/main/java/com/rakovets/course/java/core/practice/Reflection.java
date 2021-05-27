package com.rakovets.course.java.core.practice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static Field getField(Class<?> clazz, String fieldName) {
        Field field = null;
        try {
            field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        return field;
    }

    public static Method getMethod(Class<?> clazz, String methodName) {
        Method method = null;
        try {
            method = clazz.getDeclaredMethod(methodName);
            method.setAccessible(true);
        } catch (SecurityException | IllegalArgumentException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return method;
    }

    public static Method[] getAllMethods(Class<?> clazz) {
        Method[] methods = null;
        try {
            methods = clazz.getDeclaredMethods();
        } catch (SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        return methods;
    }
}
