package com.rakovets.course.java.core.practice.exception_handling.task_01_Test;

import com.rakovets.course.java.core.practice.exception_handling.task_01.Task01;

public class Task01Demo {
    public static void main(String[] args) {
        try {
            Task01.throwSomeException();
        } catch (NullPointerException e) {
            System.out.println("Field str of Object tsk1 is null!!!" );
        }
    }
}
