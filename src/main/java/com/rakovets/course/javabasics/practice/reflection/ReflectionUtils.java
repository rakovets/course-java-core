package com.rakovets.course.javabasics.practice.reflection;

import com.rakovets.course.javabasics.example.reflection.model.User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static Field getField(Class<? extends User> userClass, String nameField) {
        Field field = null;
        try {
            field = userClass.getDeclaredField(nameField);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return field;
    }

    public static Method getMethod(Class<? extends User> userClass, String nameMethod) {
        Method method = null;
        try {
            method = userClass.getDeclaredMethod(nameMethod);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return method;
    }

    public static Method[] getArrayOfMethods(Class<? extends User> userClass) {
        return userClass.getDeclaredMethods();
    }

    public static Object getMethodsOfObject(User user, Method method) {
        Object object = null;
        try {
            object = method.invoke(user);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void setFieldObject(Field field, User user, Object object) {
        try {
            field.set(user, object);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

}
