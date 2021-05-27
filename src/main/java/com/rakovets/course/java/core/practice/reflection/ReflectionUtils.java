package com.rakovets.course.java.core.practice.reflection;

import com.rakovets.course.java.core.practice.reflection.model.Car;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {

    public static Field getField(Class<Car> clazz, String fieldName) {
        Field classField = null;
        try {
            classField = clazz.getField(fieldName);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return classField;
    }

    public static Method getMethod(Class<Car> clazz, String methodName) {
        Method classMethod = null;
        try {
            classMethod = clazz.getMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return classMethod;
    }

    public static Method[] getAllMethod(Class<Car> clazz) {
        return clazz.getMethods();
    }

    public static void invokeMethod(Method method, Car car) {
        try {
            method.invoke(car);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void setField(Field field, Car car, String brand){
        try {
            field.set(car, brand);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Method getAnotherMethod(Class<Car> clazz, String title, Class<String> classParametr) {
        Method method = null;
        try {
            method = clazz.getMethod(title,classParametr);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return method;
    }

    public static void invokeAnotherMethod(Method method, Car car, String distance) {
        try {
            method.invoke(car, distance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
