package com.rakovets.course.javabasics.example.datatypes;

public class Example3Literals {
    public static void main(String[] args) {
        // long
//        long a = 1_234_567_890_1; // error: integer number too large
        long b = 1_234_567_890_1L; // Все в порядке
        long c = 1_234_567_890_1l; // Not recommend. Use `L`

        // float
//        float d = 2.718; // error: incompatible types: possible lossy conversion from double to float
        float e = 2.718F; // Все в порядке
        float f = 2.718f; // Все в порядке

        // double
        double g = 2.123_456_789; // Тип double в классическом виде
        double h = 4.05E-13; // Тип double в научном виде

        // char
        char i = 'A'; // A (latin)
        char j = '\u0041'; // A (latin)
        char k = 65; // A (latin)
    }
}
