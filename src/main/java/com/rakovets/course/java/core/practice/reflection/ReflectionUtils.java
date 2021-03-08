package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReflectionUtils {

    public static Field getField(Class<?> clazz, String field) throws NoSuchFieldException {
        return clazz.getDeclaredField(field);
    }

    public static Method getMethod(Class<?> clazz, String method) throws NoSuchMethodException {
        return clazz.getDeclaredMethod(method);
    }

    public static List<String> getMethodsArray(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        List<String> list = new ArrayList<>();
        for(Method method : methods) {
            list.add(method.getName());
        }
        Collections.sort(list);
        return list;
    }

    public static String startMethodWithObject(Object object, Method method) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        return method.invoke(object).toString();
    }

    public static void changeField (Field field, Object object, String valueToChangeField) throws  IllegalAccessException {
        field.setAccessible(true);
        field.set(object, valueToChangeField);
    }

    public static void changeField (Field field, Object object, int valueToChangeField) throws  IllegalAccessException {
        field.setAccessible(true);
        field.set(object, valueToChangeField);
    }

    public static Method getMethodWithParams (Class<?> clazz, String methodName, Class<?>[] paramTypes) throws NoSuchMethodException {
        return clazz.getDeclaredMethod(methodName, paramTypes);
    }

    public static String startMethodWithObjectParams (Method method, Object object, Object[] params) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        return method.invoke(object, params).toString();
    }
}
