package com.rakovets.course.java.core.example.annotations.example8;

public class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Выполнился метод из класса-наследника");
    }
}
