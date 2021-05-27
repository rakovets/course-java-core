package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static Field getFieldFromObject(String name, Class clazz) throws IllegalAccessException, NoSuchFieldException {
        Field modelFields;
        clazz = Class.class;
        modelFields = clazz.getDeclaredField(name);
        modelFields.setAccessible(true);
        return (Field) modelFields.get(clazz);
    }

    public static Method getMethodFromObject(String name, Class clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method modelMethod;
        clazz = Class.class;
        modelMethod = clazz.getDeclaredMethod(name);
        modelMethod.setAccessible(true);
        return (Method) modelMethod.invoke(clazz);
    }
}
