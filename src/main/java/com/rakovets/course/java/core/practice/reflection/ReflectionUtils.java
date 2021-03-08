package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class ReflectionUtils {

    public static Field getField(Class<?> clazz, String fieldName) throws ReflectionUtilsException {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException | SecurityException ex) {
            throw new ReflectionUtilsException("No field");
        }
    }

    public static Method getMethod(Class<?> clazz, String methodName) throws ReflectionUtilsException {
        try {
            return clazz.getDeclaredMethod(methodName);
        } catch (NoSuchMethodException | SecurityException ex) {
            throw new ReflectionUtilsException("No method");
        }
    }

    public static Method[] getArrayMethods(Class<?> clazz) throws ReflectionUtilsException {
        try {
            return clazz.getDeclaredMethods();
        } catch (SecurityException ex) {
            throw new ReflectionUtilsException("No array method");
        }
    }

    public static Object getMethodObject(Method method, Object object) throws ReflectionUtilsException {
        try {
            method.setAccessible(true);
            return method.invoke(object);
        } catch (InvocationTargetException | IllegalAccessException | IllegalArgumentException ex) {
            throw new ReflectionUtilsException("No method in Object");
        }
    }
}
