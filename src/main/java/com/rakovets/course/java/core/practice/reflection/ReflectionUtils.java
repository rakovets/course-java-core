package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static Field getField(Class<?> clazz, String fieldName) throws ReflectiveOperationException {
        Field classField = null;
        classField = clazz.getField(fieldName);
        return classField;
    }

    public static Method getMethod(Class<?> clazz, String methodName) throws ReflectiveOperationException {
        Method classMethod = null;
        classMethod = clazz.getMethod(methodName);
        return classMethod;
    }

    public static Method[] getAllMethod(Class<?> clazz) {
        return clazz.getMethods();
    }

    public static void callMethod(Method method, Object object) throws ReflectiveOperationException {
            method.invoke(object);
    }

    public static void setField(Field field, Object object, Object value) throws ReflectiveOperationException{
        field.set(object, value);
    }
}
