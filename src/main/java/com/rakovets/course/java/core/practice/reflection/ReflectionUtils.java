package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static Field getField(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        return clazz.getDeclaredField(fieldName);
    }

    public static Method getMethod(Class<?> clazz, String methodName) throws NoSuchMethodException {
        return clazz.getDeclaredMethod(methodName);
    }

    public static Method[] getArrayOfMethod(Class<?> clazz) {
        return clazz.getDeclaredMethods();
    }

    public static Object startMethod(Method method, Object obj) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        return method.invoke(obj);
    }

    public static void setValueInField(Field field, Object obj, Object value) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(obj, value);
    }

    public static Method getMethod(Class<?> clazz, String methodName, Class<?>... params) throws NoSuchMethodException {
        return clazz.getDeclaredMethod(methodName, params);
    }

    public static Object startMethod(Method method, Object obj, Object... args) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        return method.invoke(obj, args);
    }
}
