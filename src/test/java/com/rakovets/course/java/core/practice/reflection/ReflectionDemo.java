package com.rakovets.course.java.core.practice.reflection;

import com.rakovets.course.java.core.practice.Reflection;

import java.lang.reflect.Field;
import java.util.Timer;

public class ReflectionDemo {
    public static void main(String[] args) {
        DateWrapper dateWrapper = new DateWrapper();
        Field field = Reflection.getField(dateWrapper.getClass(), "time");
        System.out.println(field);
    }
}
