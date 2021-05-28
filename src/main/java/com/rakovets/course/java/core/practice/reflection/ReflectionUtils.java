package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static Field getFieldFromObject(Class<?> clazz, String name) throws IllegalAccessException, NoSuchFieldException {
        Field modelFields = clazz.getDeclaredField(name);
        modelFields.setAccessible(true);
        return modelFields;
    }

    public static Method getMethodFromObject(Class<?> clazz, String name) throws NoSuchMethodException {
        return clazz.getMethod(name);
    }

    public static Method[] getAllMethodFromObject(Class<?> clazz) {
        return clazz.getMethods();
    }

    public static void invokeMethodFromObject(Method method, Object object) throws IllegalAccessException, InvocationTargetException {
        method.invoke(object);
    }

    public static void setObjectField(Field field, Object object, String value) throws IllegalAccessException {
        field.set(object, value);
    }
}
