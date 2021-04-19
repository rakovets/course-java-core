package com.rakovets.course.java.core.practice.exception_handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        Exceptions exceptions = new Exceptions();
        try {
            exceptions.Task01();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        exceptions.Task02();

        try {
            exceptions.Task03();
        } catch (ExceptionTask03 ex) {
            System.out.print(ex.getMessage());
            ex.printStackTrace();
        }

        try {
            exceptions.Task04();
        } catch (ExceptionTask04 ex02) {
            System.out.println(ex02.getMessage());
            ex02.printStackTrace();
        }

        exceptions.Task05();

        try {
            exceptions.Task06();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        exceptions.Task07();
    }
}
