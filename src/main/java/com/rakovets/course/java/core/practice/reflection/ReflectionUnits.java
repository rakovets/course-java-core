package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUnits {

    public Field printField(Class<?> cls, String fieldName) throws NoSuchFieldException {
        return cls.getDeclaredField(fieldName);
    }

    public Method printMethod(Class<?> cls, String methodName) throws NoSuchMethodException {
        return cls.getDeclaredMethod(methodName);
    }

    public Method[] printArrayMethods(Class<?> cls) {
        return cls.getDeclaredMethods();
    }

    public Object invokeMethod(Object obj, Method method) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        return method.invoke(obj);
    }

    public void setValue(Field field, Object obj, Object value) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(obj, value);
    }

    public Method getMethod(Class<?> cls, String methodName, Class... parameters) throws NoSuchMethodException {
        return cls.getDeclaredMethod(methodName, parameters);
    }

    public Object invokeMethodOnObject(Method method, Object obj, Object...args) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        return method.invoke(obj, args);
    }
}
