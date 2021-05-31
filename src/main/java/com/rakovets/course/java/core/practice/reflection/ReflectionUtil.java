package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtil {

    public static Field getFieldFromObj(Class<?> clazz, String name) throws IllegalAccessException, NoSuchFieldException{
        Field fieldOfModel = clazz.getDeclaredField(name);
        fieldOfModel.setAccessible(true);
        return  fieldOfModel;
    }

    public static Method getMethodFromObj(Class<?> clazz, String name) throws NoSuchMethodException{
        return clazz.getMethod(name);
    }

    public static Method[] getAllMethods(Class<?> clazz) {
        return clazz.getDeclaredMethods();
    }

    public static void invokeMethod(Method method, Object object) throws IllegalAccessException, InvocationTargetException{
        method.invoke(object);
    }

    public static void setField(Field field, Object object, String newValue) throws IllegalAccessException{
        field.set(object,newValue);
    }
}
