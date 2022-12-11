package com.rakovets.course.java.core.practice.reflection;

import java.util.Arrays;

public class ReflectionDemo {
    public static void main(String[] args) throws UserInputException, NoSuchFieldException, NoSuchMethodException {
        ReflectionUtil reflectionUtil = new ReflectionUtil();

        Class<Person> sam = Person.class;
        Person jack = new Person("Jack", 38);

        System.out.println(reflectionUtil.getRequestedClassField(sam, "age"));
        System.out.println(reflectionUtil.getMethodByClass(sam, "getName"));
        System.out.println(Arrays.toString(reflectionUtil.getMethodsArray(sam)));
        reflectionUtil.getMethodOnThisObject(reflectionUtil.getMethodByClass(sam, "getName"), jack);
        reflectionUtil.setValueByFieldAndClass(jack.getClass().getDeclaredField("age"), jack, 30);
        System.out.println("Person age : " + jack.getAge());
        System.out.println(reflectionUtil.getMethod(sam, "setName", String.class));
        System.out.println(reflectionUtil.invokeMethodByObject(jack.getClass().getDeclaredMethod("toString"), jack, (Object[]) null));
    }
}
