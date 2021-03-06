package com.rakovets.course.java.core.practice.reflection.reflection_utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {

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

    public static Object getInvokedMethod(Method method, Object object) {
        Object objectMethod = null;
        try {
            objectMethod = method.invoke(object);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return objectMethod;
    }

    public static void setField(Field field, Object object, Object value) {
        try {
            field.set(object, value);
            field.setAccessible(true);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Method getMethodParam(Class<?> clazz, String methodName, Class<?> ...param) {
        Method method = null;
        try {
            method = clazz.getDeclaredMethod(methodName, param);
            method.setAccessible(true);
        } catch (SecurityException | IllegalArgumentException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return method;
    }

    public static Object getMethodObject(Method method, Object object, Object ...param) {
        try {
            method = (Method) method.invoke(object, param);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
        return method;
    }
}
