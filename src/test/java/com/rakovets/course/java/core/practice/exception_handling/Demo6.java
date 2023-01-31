package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.FirstException;
import com.rakovets.course.java.core.practice.exception_handling.exception.SecondException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ThirdException;

public class Demo6 {
    public static void main(String[] args) {
        Task6 t6 = new Task6();
        try {
            t6.generateException();
        } catch (FirstException | SecondException e) {
            e.printStackTrace();
        } catch (ThirdException e) {
            System.out.println(e.getMessage());
        }
    }
}
