package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyException;

public class Demo5 {
    public static void main(String[] args) {
        Task5 t5 = new Task5();
        try {
            t5.printElement(3);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
