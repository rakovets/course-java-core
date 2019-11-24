package com.rakovets.course.challenge.exception;

public class Task7 {
    public static void main(String[] args) {
        int a = 3;
        try {
            if (a >= 1) {
                throw new Exception("Число должно быть меньше 1");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Блок finally");
        }
        System.out.println("Программа завершена!");
    }

}
