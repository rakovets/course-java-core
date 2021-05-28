package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtilDemo {
    public static void main(String[] args) {
        String fieldName = "name";
        String methodName = "getName";
        Model model = new Model("Tokamo");
        Class<Model> modelClass = Model.class;
        try {
            System.out.println("Field\n" + ReflectionUtils.getFieldFromObject(modelClass, fieldName));
            System.out.println("Method\n" + ReflectionUtils.getMethodFromObject(modelClass, methodName));
            System.out.println("All Methods");
            for (Method method : ReflectionUtils.getAllMethodFromObject(modelClass)) {
                System.out.println(method);
            }
            System.out.println("Invoke method");
            ReflectionUtils.invokeMethodFromObject(ReflectionUtils.getMethodFromObject(modelClass, methodName), model);
            System.out.println("5\nOld field name: " + model.getName());
            ReflectionUtils.setObjectField(ReflectionUtils.getFieldFromObject(modelClass, fieldName), model, "hello");
            System.out.println("New field name: " + model.getName());
        } catch (IllegalAccessException | NoSuchFieldException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
