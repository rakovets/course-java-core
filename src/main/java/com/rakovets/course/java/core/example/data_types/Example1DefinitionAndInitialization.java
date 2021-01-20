package com.rakovets.course.java.core.example.data_types;

public class Example1DefinitionAndInitialization {
    public static void main(String[] args) {
        // Way 1
        int x; // объявление переменной
        x = 10; // присвоения значения
        System.out.println(x); // 10

        // Way 2
        int y = 10; // объявление и инициализация переменной
        System.out.println(y); // 10

        // Compile Error
        int z;
//        System.out.println(z); // java: variable x might not have been initialized
    }
}
