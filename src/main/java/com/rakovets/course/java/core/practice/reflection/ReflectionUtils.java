package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static Field getField(Class<?> clazz, String fieldName) {
        Field field = null;
        try {
            field = clazz.getField(fieldName);
            field.setAccessible(true);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return field;
    }

    public static Method getMethod(Class<?> clazz, String methodName) {
        Method method = null;
        try {
            method = clazz.getDeclaredMethod(methodName);
            method.setAccessible(true);
        } catch (NoSuchMethodException | SecurityException | IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return method;
    }

    public static Method[] getAllMethods(Class<?> clazz) {
        Method[] methods = null;
        try {
            methods = clazz.getDeclaredMethods();
        } catch (SecurityException | IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return methods;
    }

    public static Object invokeMetod(Method method, Object object) {
        Object objectMetod = null;
        try {
            method.setAccessible(true);
            objectMetod = method.invoke(object);

        } catch (SecurityException | IllegalArgumentException | IllegalAccessException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return objectMetod;
    }

    public static void setField(Field field, Object object, Object valueField) {
        try {
            field.set(object, valueField);
            field.setAccessible(true);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }

    public static Method getMethodParametrs(Class<?> clazz, String methodName, Class<?>... parametrs) {
        Method method = null;
        try {
            method = clazz.getDeclaredMethod(methodName, parametrs);
            method.setAccessible(true);
        } catch (SecurityException | IllegalArgumentException | NoSuchMethodException ex) {
            ex.printStackTrace();
        }
        return method;
    }

    public static Object invokeMethodObject(Method method, Object object, Object... parametrs) {
        try {
            method = (Method) method.invoke(object, parametrs);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return method;
    }
}
