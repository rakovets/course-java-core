package com.rakovets.course.javabasics.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefUtil {
    public static Field getField(Class<?> clas1, String fieldName) {
        Field res = null;
        try {
            res = clas1.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static Method getMethod(Class<?> clas1, String methodName) {
        Method result = null;
        try {
            result = clas1.getDeclaredMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static Method[] getArrayOfMethods(Class<?> clas1) {
        return clas1.getDeclaredMethods();
    }

    public static Object getInvokeMethod(Method method, Object object) {
        Object res = null;
        try {
            res = method.invoke(object);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return res;
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
