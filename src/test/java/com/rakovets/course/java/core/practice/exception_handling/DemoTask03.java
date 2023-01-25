package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.DegreeOfAlcoholValidation;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Tasks;

public class DemoTask03 {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        try {
            tasks.callDegreeOfAlcoholValidation(31);
        } catch (DegreeOfAlcoholValidation ex) {
            System.out.println("stack trace");
        }
    }
}
