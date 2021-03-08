package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoReflection {
    public static void main(String[] args) {
        ReflectionUtils reflUt = new ReflectionUtils();
        try {
            Field field = reflUt.getField(User.class, "name");
            System.out.println(field);
        } catch (NoSuchFieldException e) {
            System.err.println("Field 'name' is not found");
        }

        try {
            Method method = reflUt.getMethod(User.class, "getName");
            System.out.println(method);
        } catch (NoSuchMethodException e) {
            System.err.println("Method 'getName' is not found");;
        }

        Method[] methods = reflUt.getArrayMethods(User.class);
        for (Method method : methods) {
            System.out.println("Method name " + method.getName());
        }

        User user = new User(7);
        Class clazz = user.getClass();
        try {
            System.out.println(reflUt.callMethod(clazz.getMethod("toString"), user));
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            System.err.println("NoSuchMethodException | InvocationTargetException | IllegalAccessException");
        }

        try {
            Field field = clazz.getField("id");
            field.setAccessible(true);
            reflUt.setNewValue(field, user, 50);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.err.println("IllegalAccessException | NoSuchFieldException");
        }
    }
}
