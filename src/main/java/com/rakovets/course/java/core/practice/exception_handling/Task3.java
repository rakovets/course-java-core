package com.rakovets.course.java.core.practice.exception_handling;

public class Task3 {

    public String checkAge(int num) throws Task3Exception {
        String result = "";
        if (num < 0) throw new Task3Exception("The age is less than 0", num);
            result = "Age is valid";
            return result;
    }
}
