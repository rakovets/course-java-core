package com.rakovets.course.java.core.practice.exception_handling.task01;

public class Task {
    public void nullStr() {
        String name = null;
        name.length();
    }

    public class Demo {
        public void Catch() {
            Task task = new Task();
            try {
                task.nullStr();
            } catch (NullPointerException e) {
                System.out.println("Null_Null_Null_");
            }
        }
    }
}
