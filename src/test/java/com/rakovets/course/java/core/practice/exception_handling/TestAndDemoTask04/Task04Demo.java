package com.rakovets.course.java.core.practice.exception_handling.TestAndDemoTask04;

import com.rakovets.course.java.core.practice.exception_handling.Task04;

public class Task04Demo {
    public static void main(String[] args) {

        try {
            Task04.throwException(null);
        } catch (Task04 e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
