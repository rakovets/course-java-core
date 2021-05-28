package com.rakovets.course.java.core.practice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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

    public static Method[] getAllMethodsFromClass(Class<?> clazz) {
        Method[] methods = null;
        try {
            methods = clazz.getDeclaredMethods();
        } catch (SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        return methods;
    }

    public static void invokeMethod(Method method, Object object) {
        try {
            method.invoke(object);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void setField(Field field, Object object, Object value) {
        try {
            field.set(object, value);
            field.setAccessible(true);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Method getMethodByParameters(Class<?> clazz, String methodName, Class<?>... parameters) {
        Method method = null;
        try {
            method = clazz.getDeclaredMethod(methodName, parameters);
            method.setAccessible(true);
        } catch (SecurityException | IllegalArgumentException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return method;
    }

    public static Object invokeMethodWithParameters(Method method, Object object, Object... parameters) {
        try {
            method = (Method) method.invoke(object, parameters);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
        return method;
    }
}
