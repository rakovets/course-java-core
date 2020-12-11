package com.rakovets.course.javabasics.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {

    public static Field getClassField(Class<?> theClass, String fieldName) {
        Field field = null;
        try {
            field = theClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        field.setAccessible(true);
        return field;
    }

    public static Field[] getClassFields(Class <?> theClass) {
        Field[] field = null;
            field = theClass.getDeclaredFields();
        for (Field field1:field) {
            System.out.println(field1.getName());
        }
        return field;
    }

    public static Method getClassMethod (Class <?> theClass, String nameOfMethod) {
        Method privateMethod = null;
        try {
             privateMethod = theClass.getDeclaredMethod(nameOfMethod);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return privateMethod;
    }

    public static Method[] getClassMethods (Class <?> theClass) {
        return theClass.getDeclaredMethods();
    }

    public static Object applyClassMethod (Method theMethod, Object object) throws InvocationTargetException, IllegalAccessException {
            return theMethod.invoke(object);
    }

    public static void setValue (Field field, Object object,Object value) {
        try {
            field.setAccessible(true);
            field.set(object,value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
