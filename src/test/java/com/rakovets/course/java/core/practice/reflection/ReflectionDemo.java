package com.rakovets.course.java.core.practice.reflection;

import com.rakovets.course.java.core.practice.Reflection;

import javax.sound.midi.MetaEventListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Timer;

public class ReflectionDemo {
    public static void main(String[] args) {
        DateWrapper dateWrapper = new DateWrapper();
        Field field = Reflection.getField(dateWrapper.getClass(), "time");
        System.out.println(field);

        Method method = Reflection.getMethod(dateWrapper.getClass(), "addMonths");
       System.out.println(method);

        Method[] methods = Reflection.getAllMethodsFromClass(dateWrapper.getClass());
        Arrays.stream(methods)
                .forEach(x -> System.out.println(x.getName()));


    }
}
