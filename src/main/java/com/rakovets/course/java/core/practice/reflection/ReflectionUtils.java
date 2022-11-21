package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public Field getFieldOfClass(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public Method getMethodOfClass(Class<?> clazz, String methodName) {
        Method method = null;
        try {
            method = clazz.getDeclaredMethod(methodName);
            method.setAccessible(true);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return method;
    }

    public Method[] getAllMethodOfClass(Class<?> clazz) {
        return clazz.getDeclaredMethods();
    }

    public Object runMethodToObject(Method method, Object obj) {
        method.setAccessible(true);
        Object obj1 = null;
        try {
           obj1 = method.invoke(obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return obj1;
    }

    public void setFieldOfObject(Field field, Object obj, Object value) {
        field.setAccessible(true);
        try {
            field.set(obj, value);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Method getMethodWithParameters(Class<?> clazz, String methodName, Class<?>... forParameters) {
        Method method = null;
        try {
            method = clazz.getDeclaredMethod(methodName, forParameters);
            method.setAccessible(true);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return method;
    }

    public Object runThisMethodWithArguments(Method method, Object obj, Object... arg) {
        method.setAccessible(true);
        try {
            return method.invoke(obj, arg);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
