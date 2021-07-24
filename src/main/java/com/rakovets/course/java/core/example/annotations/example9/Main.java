package com.rakovets.course.java.core.example.annotations.example9;

public class Main implements MyFunctionalInterface {
    public static void main(String[] args) {
        Main main = new Main();
        main.abstractMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("Это сообщение из abstractMethod()");
    }
}
