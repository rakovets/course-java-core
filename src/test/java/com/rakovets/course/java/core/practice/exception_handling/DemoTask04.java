package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomRuntimeException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Tasks;

public class DemoTask04 {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        try {
            tasks.callMyCustomRuntimeException(17);
        } catch (CustomRuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
