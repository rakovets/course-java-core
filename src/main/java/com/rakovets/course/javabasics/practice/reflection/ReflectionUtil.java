package com.rakovets.course.javabasics.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil {
    public static Field getField(Class<?> clazz, String fieldName) {
        Field result = null;
        try {
            result = clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static Method getMethod(Class<?> clazz, String methodName) {
        Method result = null;
        try {
            result = clazz.getDeclaredMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static Method[] getArrayOfMethods(Class<?> clazz) {
        return clazz.getDeclaredMethods();
    }

    public static Object getInvokedMethod(Method method, Object object) {
        Object result = null;
        try {
            result = method.invoke(object);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void setValueToField(Field field, Object object, Object value) {
        field.setAccessible(true);
        try {
            field.set(object, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
