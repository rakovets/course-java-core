package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionUtilDemo {
    public static void main(String[] args) {
        String nameOfModel = "name";
        String methodOfModel = "getName";
    Model model = new Model("SomeName");
    Class<Model> modelClass = Model.class;
        try {
        System.out.println("Get Field\n" + ReflectionUtil.getFieldFromObj(modelClass, nameOfModel));
        System.out.println("Get Method\n" + ReflectionUtil.getMethodFromObj(modelClass, methodOfModel));
        System.out.println("Get All Methods");
        for (Method method : ReflectionUtil.getAllMethods(modelClass)) {
            System.out.println(method);
        }
        System.out.println("Invoke method");
        ReflectionUtil.invokeMethod(ReflectionUtil.getMethodFromObj(modelClass, "printName"), model);
        System.out.println("Change field\nOld field name: " + model.getName());
        ReflectionUtil.setField(ReflectionUtil.getFieldFromObj(modelClass, nameOfModel), model, "smthnew");
        System.out.println("New field name: " + model.getName());
    }
     catch (IllegalAccessException | NoSuchFieldException | InvocationTargetException | NoSuchMethodException e) {
        e.printStackTrace();
    }

}   }
