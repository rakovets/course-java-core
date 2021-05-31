package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtilsDemo {
    public static void main(String[] args) {
        String fieldName = "name";
        String methodName = "getName";
        Template template = new Template("Sport");
        Class<Template> modelClass = Template.class;
        try {
            System.out.println("Get Field\n" + ReflectionUtils.getObjectField(modelClass, fieldName));
            System.out.println("Get Method\n" + ReflectionUtils.getObjectMethod(modelClass, methodName));
            System.out.println("Get All Methods\n");
            for (Method method : ReflectionUtils.getAllObjectMethod(modelClass)) {
                System.out.println(method);
            }
            System.out.println("Invoke method\n");
            ReflectionUtils.invokeObjectMethod(ReflectionUtils.getObjectMethod(modelClass, "printName"), template);
            System.out.println("Change field\nPast field name: " + template.getName());
            ReflectionUtils.setObjectField(ReflectionUtils.getObjectField(modelClass, fieldName), template, "NoSport");
            System.out.println("New field name: " + template.getName());
        } catch (IllegalAccessException | NoSuchFieldException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
