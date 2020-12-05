package com.rakovets.course.javabasics.example.reflection;

import com.rakovets.course.javabasics.example.reflection.model.Student;

import java.lang.reflect.Field;

public class ReflectionExample3Field {
    public static void main(String[] args) {
        // Access private fields using reflection
        // Field stores info on a single field of a class
        Field privateStringNickname = null;
        try {
            // Create a Student object
            Student student = new Student("Alias", "Burn");
            student.setNickname("Ali-B");

            // Define the private field you want to access
            // I can access any field with just its name dynamically
            Class<Student> studentClass = Student.class;
            privateStringNickname = studentClass.getDeclaredField("nickname");

            // Shuts down security allowing you to access private fields
            privateStringNickname.setAccessible(true);

            // Get the value of a field and store it in a String
            String valueOfName = (String) privateStringNickname.get(student);
            System.out.println("Student Private Name: " + valueOfName);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
