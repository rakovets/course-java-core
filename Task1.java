package com.rakovets.course.challenge.exception;

public class Task1 {
    public static void main(String[] args) {
        try {
            display(null);
            String a = null;
        } catch (NullPointerException ex) {
            System.out.println("Ошибка!!! ");
        }
        System.out.println("Программа завершена");
    }
    static void display(String a) {
        if (a == null) {
            throw new NullPointerException("a = null");
        }
        System.out.println(a);
    }
}
