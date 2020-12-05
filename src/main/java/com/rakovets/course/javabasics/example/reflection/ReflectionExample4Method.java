package com.rakovets.course.javabasics.example.reflection;

import com.rakovets.course.javabasics.example.reflection.model.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample4Method {
    public static void main(String[] args) {
        // Access private fields using reflection
        // Field stores info on a single field of a class
        Field privateStringNickname;
        try {
            // Create a Student object
            Student student = new Student("Alias", "Burn");
            student.setFee(500);

            // Get access to a private method
            // getDeclaredMethod("methodName", methodParameters or null)

            // Since I provide the method name as a String I can run any method
            // without needing to follow the normal convention methodName()
            String methodName = "getFee";
            Class<Student> studentClass = Student.class;
            Method privateMethod = studentClass.getDeclaredMethod(methodName);

            // get the return value from the method
            double privateReturnVal = (double) privateMethod.invoke(student);
            System.out.println("Student Private Method: " + privateReturnVal);

            // Execute a method that has parameters
            // Define the parameters expected by the private method
            Class<?>[] methodParameters = new Class[]{double.class};

            // Provide the parameters above with values
            Object[] params = new Object[]{100.00};

            // Get the method by providing its name and a Class array with parameters
            privateMethod = Student.class.getDeclaredMethod("updateFee", double.class);

            // Shuts down security allowing you to access private methods
            privateMethod.setAccessible(true);

            // Execute the method and pass parameter values. The return value is stored
            privateReturnVal = (double) privateMethod.invoke(student, params);
            System.out.println("Student Other Private Method: " + privateReturnVal);
        } catch (SecurityException | IllegalArgumentException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
