package com.rakovets.course.java.core.example.data_types;

public class Example5NumericalPlace {
    public static void main(String[] args) {
        int x = 123456789;
        int y = 123_456_789;
        int z = 123___456______789;
        System.out.println(x); // 123456789
        System.out.println(y); // 123456789
        System.out.println(z); // 123456789
    }
}
