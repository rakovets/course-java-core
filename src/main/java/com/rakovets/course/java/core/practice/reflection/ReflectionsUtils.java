package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionsUtils {

    public static Field getField(Class<?> clazz, String name) throws CustomException {
        try {
            return clazz.getDeclaredField(name);
        }catch (NoSuchFieldException ex) {
            throw new CustomException("No field found");
        }
    }

    public static Method getMethod(Class<?> clazz, String method) throws CustomException {
        try {
            return clazz.getDeclaredMethod(method);
        } catch (NoSuchMethodException ex) {
            throw new CustomException("No method found");
        }
    }

    public static Method[] getAllMethods(Class<?> clazz) {
        return clazz.getDeclaredMethods();
    }

    public static Object invokeMethod(Object obj, Method method) throws CustomException {
       try {
           method.setAccessible(true);
           return method.invoke(obj);
       } catch (InvocationTargetException | IllegalAccessException inv) {
           throw new CustomException("Can't invoke method");
       }
    }

    public static <T> void setField(Field field, Object obj, T param) throws CustomException {
        try {
            field.setAccessible(true);
            field.set(obj, param);
        } catch (IllegalArgumentException | IllegalAccessException exc) {
            throw new CustomException("Can't set this value to the field");
        }
    }
}
