package com.rakovets.course.java.core.practice.reflection;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionDemo {
    public static void main(String[] args) {
        DateWrapper dateWrapper = new DateWrapper(10);
        Field field = Reflection.getField(dateWrapper.getClass(), "time");
        System.out.println(field);

        Method method = Reflection.getMethod(dateWrapper.getClass(), "getTime");
        System.out.println(method);

        Method[] methods = Reflection.getAllMethodsFromClass(dateWrapper.getClass());
        Arrays.stream(methods)
                .forEach(x -> System.out.println(x.getName()));

        Reflection.invokeMethod(method, dateWrapper);

        System.out.println("Time is " + dateWrapper.getTime());
        Reflection.setField(field, dateWrapper, 200);
        System.out.println("New time is " + dateWrapper.getTime());
    }
}
