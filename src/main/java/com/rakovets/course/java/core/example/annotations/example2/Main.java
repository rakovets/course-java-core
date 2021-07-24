package com.rakovets.course.java.core.example.annotations.example2;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        testInterface(parent);
        testInterface(child);

        testAnnotation(parent);
        testAnnotation(child);
    }

    public static void testInterface(MyMark markedObject) {
        System.out.println("Метод 'TestInterface' успешно завершен!");
    }

    public static void testAnnotation(Object object) {
        if (!object.getClass().isAnnotationPresent(MyAnnotation.class)) {
            throw new RuntimeException("Объект не аннотирован аннотацией 'MyAnnotation'");
        }
        System.out.println("Метод 'testAnnotation' успешно завершен!");
    }
}
