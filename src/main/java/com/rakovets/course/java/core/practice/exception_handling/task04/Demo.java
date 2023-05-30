package com.rakovets.course.java.core.practice.exception_handling.task04;

import com.rakovets.course.java.core.practice.exception_handling.task03.Task;

public class Demo {
    public static void main(String[] args) {
        Task task = new Task();
        try {
            task.outException();
        } catch (Task.newException e) {
            e.printStackTrace();
        }
    }
}
