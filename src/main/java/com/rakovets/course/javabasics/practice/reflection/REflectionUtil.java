package com.rakovets.course.javabasics.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class REflectionUtil {
    public static Field getField(Class<? extends Student> batmanClass, String fieldname) {
        try {
            Field field = batmanClass.getDeclaredField(fieldname);
            field.setAccessible(true);
            return field;

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Method getMethod(Class<? extends Student> batmanClass, String methodName, Class<?> ...param) {
        try {
            Method method = batmanClass.getDeclaredMethod(methodName, param);
            method.setAccessible(true);
            return method;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Method[] getAllMethods(Class<? extends Student> batmanClass) {
        return batmanClass.getDeclaredMethods();
    }

    public static Object runMethod(Student batman, Method method, Object ...param) {
        try {
            return method.invoke(batman, param);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return "Error!";
    }

    public static void setField(Field field, Student batman, Object value) {
        String obj = value.getClass().getSimpleName();
        try {
            if (obj.equals("Integer")) field.setInt(batman, (Integer) value);
            else field.set(batman, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
