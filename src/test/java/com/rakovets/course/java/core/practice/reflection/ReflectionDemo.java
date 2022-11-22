package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ReflectionUnits reflectionUnits = new ReflectionUnits();

        Class<Cat> bob = Cat.class;
        Cat tom = new Cat("Bob", "persian", 2);

        System.out.println("Task 1");
        System.out.println(reflectionUnits.printField(bob, "age"));
        System.out.println(reflectionUnits.printMethod(bob, "toString"));
        System.out.println(Arrays.toString(reflectionUnits.printArrayMethods(bob)));
        System.out.println(" ");

        System.out.println("Task 2");
        System.out.println(reflectionUnits.invokeMethod(tom, tom.getClass().getDeclaredMethod("toString")));
        reflectionUnits.setValue(tom.getClass().getDeclaredField("name"), tom, "Tom");
        reflectionUnits.setValue(tom.getClass().getDeclaredField("age"), tom, 10 );
        System.out.println("Cat name: " + tom.getName());
        System.out.println("Cat age: " + tom.getAge());
        System.out.println(" ");

        System.out.println("Task 3");
        System.out.println(reflectionUnits.getMethod(bob, "setAge", int.class ));
        System.out.println(reflectionUnits.invokeMethodOnObject(tom.getClass().getDeclaredMethod("toString"), tom, (Object[]) null));
    }
}
