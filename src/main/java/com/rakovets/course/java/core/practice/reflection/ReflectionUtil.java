package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil {
    public Field getFieldByName(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        return clazz.getDeclaredField(fieldName);
    }

    public Method getMethodByName(Class<?> clazz, String methodName) throws NoSuchMethodException {
        return clazz.getDeclaredMethod(methodName);
    }

    public Method[] getAllMethods(Class<?> clazz) {
        return clazz.getDeclaredMethods();
    }

    public Object invokeMethodOnObject(Method method, Object obj) throws IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        method.setAccessible(true);
        return method.invoke(obj);
    }

    public void setValue(Field field, Object obj, Object value) throws IllegalArgumentException, IllegalAccessException {
        field.setAccessible(true);
        field.set(obj, value);
    }

    public Method getMethodByNameAndParameters(Class<?> clazz, String methodName, Class<?>... params)
            throws NoSuchMethodException, SecurityException {
        return clazz.getDeclaredMethod(methodName, params);
    }

    public Object invokeMethodWithArgumentsOnObject(Method method, Object obj, Object... args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        method.setAccessible(true);
        return method.invoke(obj, args);
    }
}
