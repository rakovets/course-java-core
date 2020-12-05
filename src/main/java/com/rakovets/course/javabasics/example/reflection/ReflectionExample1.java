package com.rakovets.course.javabasics.example.reflection;

import com.rakovets.course.javabasics.example.reflection.model.Student;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionExample1 {
    public static void main(String[] args) {
        // Getting the class Object for Student
        // Everything in Java has a Class Object
        Class<Student> studentClass = Student.class;

        // Get the class name of an Object
        String className = studentClass.getName();
        System.out.println(className + "\n");

        // Check modifiers of a class
        // isAbstract, isFinal, isInterface, isPrivate, isProtected,
        // isStatic, isStrict, isSynchronized, isVolatile
        int classModifiers = studentClass.getModifiers();
        System.out.printf("is Public class? %s\n\n", Modifier.isPublic(classModifiers));

        // You can get a list of interfaces used by a class
        Class<?>[] interfaces = studentClass.getInterfaces();
        Arrays.stream(interfaces)
                .map(Class::getCanonicalName)
                .forEach(System.out::println);
        System.out.println();

        // Annotations
        Annotation[] annotations = studentClass.getAnnotations();
        Arrays.stream(annotations)
                .map(a -> a.annotationType().getCanonicalName())
                .forEach(System.out::println);
        System.out.println();

        // Get the super class for Student
        Class<? super Student> superclass = studentClass.getSuperclass();
        System.out.println(superclass.getName() + "\n");

        // Get the objects methods, return type and parameter type
        Method[] classMethods = studentClass.getMethods();
        for (Method method : classMethods) {
            // Get the method name
            System.out.println("Method Name: " + method.getName());

            // Check if a method is a getter or setter
            if (method.getName().startsWith("get")) {
                System.out.println("Getter Method");
            } else if (method.getName().startsWith("set")) {
                System.out.println("Setter Method");
            }

            // Get the methods return type
            System.out.println("Return Type: " + method.getReturnType());
            Class<?>[] parameterType = method.getParameterTypes();

            // List parameters for a method
            if (parameterType.length != 0) {
                System.out.println("Parameters:");
                for (Class<?> parameter : parameterType) {
                    System.out.printf("\t%s\n", parameter.getName());
                }
            }
            System.out.println();
        }
    }
}
