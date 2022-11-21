package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class ReflectionUnits {
    private static final Logger LOGGER = Logger.getLogger(ReflectionUnits.class.getName());

    public Field printField(Class<?> cls, String fieldName) {
        Field field = null;
        try {
            field = cls.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            LOGGER.warning(e.getMessage());
        }
        return field;
    }

    public Method printMethod(Class<?> cls, String methodName) {
        Method method = null;
        try {
            method = cls.getDeclaredMethod(methodName);
        } catch (NoSuchMethodException e) {
            LOGGER.warning(e.getMessage());
        }
        return method;
    }

    public Method[] printArrayMethods(Class<?> cls) {
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            LOGGER.info("Method name: " + method.getName() + " Return type: " + method.getReturnType().getName());

            Class<?>[] params = method.getParameterTypes();
            for (Class<?> paramType : params) {
                LOGGER.info("Parameter: " + paramType.getName());
            }
        }
        return methods;
    }

    public Object invokeMethod(Object obj, Method method) {
        Object newObj = null;
        try {
            method.setAccessible(true);
            newObj = method.invoke(obj);
        } catch (InvocationTargetException  | IllegalAccessException e) {
            LOGGER.warning(e.getMessage());
        }
        return newObj;
    }

    public void setValue(Field field, Object obj, Object value) {
        try {
            field.setAccessible(true);
            field.set(obj, value);
        } catch (IllegalAccessException e) {
            LOGGER.warning(e.getMessage());
        }
    }

    public Method getMethod(Class<?> cls, String methodName, Class... parameters) {
        Method method = null;
        try {
            method = cls.getDeclaredMethod(methodName, parameters);
        } catch (NoSuchMethodException e) {
            LOGGER.warning(e.getMessage());
        }
        return method;
    }

    public Object invokeMethodOnObject(Method method, Object obj, Object...args) {
        Object result = null;
        try {
            method.setAccessible(true);
            result = method.invoke(obj, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            LOGGER.warning(e.getMessage());
        }
        return result;
    }
}
