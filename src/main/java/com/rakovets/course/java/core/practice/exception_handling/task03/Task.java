package com.rakovets.course.java.core.practice.exception_handling.task03;

public class Task {
    public class newException extends Exception {
        public newException(String message) {
            super(message);
        }
    }

    public void outException() throws newException {
        throw new newException("ppc");
    }

    public class Demo {
        public void main(String[] args) {
            Task task = new Task();
            try {outException();
            } catch (newException e) {
                e.printStackTrace();
            }
        }
    }
}
