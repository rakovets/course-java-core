package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil {
    public static Field getField(Class<?> clazz, String name) {
        Field classField = null;
        try {
            classField = clazz.getField(name);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return classField;
    }

    public static Method getMethod(Class<?> clazz, String name) {
        Method classMethod = null;
        try {
            classMethod = clazz.getMethod(name);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return classMethod;
    }

    public static Method[] getAllMethods(Class<?> clazz) {
        return clazz.getMethods();
    }

    public static void callMethod(Method method, Object object) {
        try {
            method.invoke(object);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
