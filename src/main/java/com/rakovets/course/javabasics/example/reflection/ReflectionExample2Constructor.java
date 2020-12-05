package com.rakovets.course.javabasics.example.reflection;

import com.rakovets.course.javabasics.example.reflection.model.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample2Constructor {
    public static void main(String[] args) {
        // Getting the class Object for Student
        // Everything in Java has a Class Object
        Class<Student> studentClass = Student.class;

        // How to access class constructors
        Constructor<Student> constructor = null;
        Object newInstance = null;
        try {
            // If you know the parameters of the constructor you
            // want you do the following.

            // To return an array of constructors instead do this
            // Constructor[] constructors = reflectClass.getConstructors();

            // If the constructor receives a String you'd use the
            // parameter new Class[]{String.class}
            // For others use int.class, double.class, etc.
            constructor = studentClass.getConstructor(new Class[]{String.class, String.class});
            System.out.println(constructor);

            // Call a constructor by passing parameters to create an object
            constructor = studentClass.getConstructor(String.class, String.class);
        } catch (NoSuchMethodException | SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        }

        // Return the parameters for a constructor
        assert constructor != null;
        Class<?>[] constructParameters = constructor.getParameterTypes();
        for (Class<?> parameter : constructParameters) {
            System.out.println(parameter.getName());
        }

        Student newStudent = null;
        try {
            // Create a Student object by calling newInstance
            newStudent = constructor.newInstance("Jon", "Smith");
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(newStudent);
    }
}
