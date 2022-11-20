package com.rakovets.course.java.core.practice.reflection;

import com.rakovets.course.java.core.practice.reflection.reflection_utils.ReflectionUtils;

import java.util.Arrays;

public class DemoReflectionUtils {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        ReflectionUtils reflectionUtils = new ReflectionUtils();

        Class<Dog> dogClass = Dog.class;
        Dog dog = new Dog("Bobik", "Poodle", 6);

        System.out.println(reflectionUtils.getFieldFromName(dogClass, "age"));
        System.out.println(reflectionUtils.getMethodFromClassAndMethodName(dogClass, "toString"));
        System.out.println(Arrays.toString(reflectionUtils.getMethodsArrayFromClass(dogClass)));
        System.out.println();

        System.out.println(reflectionUtils.getClassMethodNameAndClassVarargs(dog, dog.getClass().getDeclaredMethod("toString")));
        reflectionUtils.setValueFromFieldAndClass(dog.getClass().getDeclaredField("name"), dog, "Persik");
        reflectionUtils.setValueFromFieldAndClass(dog.getClass().getDeclaredField("age"), dog, 10);
        System.out.println("Dog name: " + dog.getName());
        System.out.println("Dog age: " + dog.getAge());
        System.out.println();

        System.out.println(reflectionUtils.getClassMethodNameAndClassVarargs(dogClass, "setAge", int.class));
        System.out.println(reflectionUtils.runMethodBasedOnMethodObjectAndObjectVarargs(dog.getClass().getDeclaredMethod("toString"), dog, (Object[]) null));
    }
}
