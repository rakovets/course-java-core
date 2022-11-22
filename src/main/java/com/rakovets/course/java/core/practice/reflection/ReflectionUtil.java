package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil {
    public Field getFieldOfClass(Class<?> c, String fieldName) throws NoSuchFieldException {
        return c.getDeclaredField(fieldName);
    }

    public Method getMethodOfClass(Class<?> c, String methodName) throws NoSuchMethodException {
        return c.getDeclaredMethod(methodName);
    }

    public Method[] getMethodArray(Class<?> c) {
        return c.getDeclaredMethods();
    }

    public void invokeMethod(Method method, Object object) throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        method.invoke(object);
    }

    public <T> void setValueOfField(Field field, Object object, T value) throws IllegalAccessException {
        field.setAccessible(true);
        field.set(object, value);
    }

    public Method getMethodWithParameters(Class<?> c, String methodName, Class<?> params) throws NoSuchMethodException {
        return c.getDeclaredMethod(methodName, params);
    }

    public void callMethods(Method method, Object object, Object... args)
            throws InvocationTargetException, IllegalAccessException {
        method.setAccessible(true);
        method.invoke(object, args);
    }
}
