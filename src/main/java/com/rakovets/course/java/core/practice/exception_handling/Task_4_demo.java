package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.NullException;
import com.rakovets.course.java.core.practice.exception_handling.model.Null;

public class Task_4_demo {
    public static void main(String[] args) {
            try {
                System.out.println(Null.getStringLength(null));
            } catch (NullException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
    }
}
