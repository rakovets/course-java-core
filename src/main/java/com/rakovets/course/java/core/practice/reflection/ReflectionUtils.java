package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static Field getField(Class<?> clazz, String fieldName) {
        Field classField = null;
        try {
            classField = clazz.getField(fieldName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return classField;
    }

    public static Method getMethod(Class<?> clazz, String methodName) {
        Method classMethod = null;
        try {
            classMethod = clazz.getMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return classMethod;
    }

    public static Method[] getAllMethod(Class<?> clazz) {
        return clazz.getMethods();
    }

    public static void invokedMethod(Method method, Object object) {
        try {
            method.invoke(object);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void setField(Field field, Object object, Object value) {
        try {
            field.set(object, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

