package com.rakovets.course.java.core.example.data_types;

public class Example7TypeCasting {
    public static void main(String[] args) {
        // Widening Casting
        short a = 'Z';
        System.out.println(a); // 90
        double b = 1_234_567_890_123_456L;
        System.out.println(b); // 1.234567890123456E15

        // Widening Casting with lossy
        float c1 = 1_234_567_890_123_456L;
        System.out.println(c1); // 1.23456795E15
        float c2 = 123_456_789;
        System.out.println(c2); // 1.23456792E8
        double c3 = 1_234_567_890_123_456_789L;
        System.out.println(c3); // 1.23456789012345677E18


        // Error: incompatible types
//        byte d = 128; // error: incompatible types: possible lossy conversion from int to byte
//        char e = 2L; // error: incompatible types: possible lossy conversion from long to char
//        short f = '\uffff'; // error: incompatible types: possible lossy conversion from char to short

        // Narrowing Casting
        byte i1 = (byte) 128;
        byte i2 = (byte) 129;
        System.out.println(i1); // -128
        System.out.println(i2); // -127
    }
}
