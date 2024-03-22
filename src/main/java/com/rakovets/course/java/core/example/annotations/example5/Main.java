package com.rakovets.course.java.core.example.annotations.example5;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        if (parent.getClass().getAnnotations().length > 0) {
            System.out.println("Для класса 'Parent' применены следующие аннотации: ");
            for (Annotation annotationName : parent.getClass().getAnnotations()) {
                System.out.println(annotationName);
            }
        } else {
            System.out.println("К классу 'Parent' не применены какие-либо аннотации.");
        }
        if (child.getClass().getAnnotations().length > 0) {
            System.out.println("\nДля класса 'Child' применены следующие аннотации: ");
            for (Annotation annotationName : child.getClass().getAnnotations()) {
                System.out.println(annotationName);
            }
        } else {
            System.out.println("\nК классу 'Child' не применены какие-либо аннотации.");
        }
    }
}
