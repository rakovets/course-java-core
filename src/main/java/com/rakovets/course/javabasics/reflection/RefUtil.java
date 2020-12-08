package com.rakovets.course.javabasics.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class RefUtil {


    public static Field getClassField(Class clazz, String name) throws NoSuchFieldException {
        return clazz.getDeclaredField(name);
    }

    public static Method getClassMethods(Class clazz, String name) throws NoSuchMethodException {
        return clazz.getDeclaredMethod(name);
    }

    public static Method[] getArrayOfMethods(Class clazz) {
        return clazz.getDeclaredMethods();
    }

    public static Object getArrayOfMethodsReflection(Method method, Object clazz) throws InvocationTargetException, IllegalAccessException {
        return method.invoke(clazz);
    }
}
