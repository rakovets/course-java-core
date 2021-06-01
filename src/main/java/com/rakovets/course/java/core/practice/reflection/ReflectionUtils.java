package com.rakovets.course.java.core.practice.reflection;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static Field getField(Class<?> clazz, String fieldName) {
        Field field = null;
        try {
            field = clazz.getField(fieldName);
            field.setAccessible(true);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return field;
    }

    public static Method getMethod(Class<?> clazz, String methodName) {
        Method method = null;
        try {
            method = clazz.getDeclaredMethod(methodName);
            method.setAccessible(true);
        } catch (NoSuchMethodException | SecurityException | IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return method;
    }

    public static Method[] getAllMethodsOfClass(Class<?> clazz) {
        Method[] methods = null;
        try {
            methods = clazz.getDeclaredMethods();
        } catch (SecurityException | IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return methods;
    }

    public static Object invokeMethod(Method method, Object object) {
        Object objectMethod = null;
        try {
            method.setAccessible(true);
            objectMethod = method.invoke(object);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return objectMethod;
    }

    public static void setField(Field field, Object object, Object value) {
        try {
            field.set(object, value);
            field.setAccessible(true);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }

    public static Method getMethodParametersOfClass(Class<?> clazz, String methodName, Class<?>... parameters) {
        Method method = null;
        try {
            method = clazz.getDeclaredMethod(methodName, parameters);
            method.setAccessible(true);
        } catch (SecurityException | IllegalArgumentException | NoSuchMethodException ex) {
            ex.printStackTrace();
        }
        return method;
    }

    public static Object invokeMethodOfObject(Method method, Object object, Object... parameters) {
        try {
            method = (Method) method.invoke(object, parameters);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return method;
    }
}
