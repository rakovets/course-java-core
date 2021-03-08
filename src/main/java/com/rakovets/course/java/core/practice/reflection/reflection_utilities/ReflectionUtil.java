package com.rakovets.course.java.core.practice.reflection.reflection_utilities;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class ReflectionUtil {
    public static Field getField(Class<?> clazz, String fieldName) throws ReflectionUtilException {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException | SecurityException ex) {
            throw new ReflectionUtilException("No such field exists or Security violation");
        }
    }

    public static Method getMethod(Class<?> clazz, String methodName) throws ReflectionUtilException {
        try {
            return clazz.getDeclaredMethod(methodName);
        } catch (NoSuchMethodException | SecurityException ex) {
            throw new ReflectionUtilException("No such method exists or Security violation");
        }
    }

    public static Method[] getAllMethods(Class<?> clazz) throws ReflectionUtilException {
        try {
            return clazz.getDeclaredMethods();
        } catch (SecurityException ex) {
            throw new ReflectionUtilException("Security violation");
        }
    }

    public static Object invokeMethod(Method method, Object object) throws ReflectionUtilException {
        try {
            method.setAccessible(true);
            return method.invoke(object);
        } catch (InvocationTargetException | IllegalAccessException | IllegalArgumentException ex) {
            throw new ReflectionUtilException("This operation is prohibited");
        }
    }

    public static <T> void setField(Field field, Object object, T data) throws ReflectionUtilException {
        try {
            field.setAccessible(true);
            field.set(object, data);
        } catch (IllegalAccessException | IllegalArgumentException ex) {
            throw new ReflectionUtilException("illegal argument or illegal access for this operation");
        }
    }

    public static Method getMethodWithFullSignature(Class<?> clazz, String methodName, Class<?>... parameters) throws ReflectionUtilException {
        try {
            return clazz.getDeclaredMethod(methodName, parameters);
        } catch (NoSuchMethodException | SecurityException ex) {
            throw new ReflectionUtilException("No such method exists or Security violation");
        }
    }

    public static Object invokeMethodWithParameters(Method method, Object object, Object... arguments) throws ReflectionUtilException {
        try {
            method.setAccessible(true);
            return method.invoke(object, arguments);
        } catch (InvocationTargetException | IllegalAccessException | IllegalArgumentException ex) {
            throw new ReflectionUtilException("This operation is prohibited");
        }
    }
}
