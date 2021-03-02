package com.rakovets.course.java.core.example.data_types;

public class Example3Literals {
    public static void main(String[] args) {
        // long
//        long a = 1_234_567_890_1; // error: integer number too large
        long b = 1_234_567_890_1L; // Все в порядке
        long c = 1_234_567_890_1l; // Not recommend. Use `L`

        // float
//        float d = 2.718; // error: incompatible types: possible lossy conversion from double to float
        float f1 = 2.718F; // Все в порядке
        float f2 = 2.718f; // Все в порядке
        float f3 = 0.0f / 0.0f; // NaN - Not-a-Number
        float f4 = 1.0f / 0.0f; // Infinity - бесконечность
        float f5 = -1.0f / 0.0f; // -Infinity - отрицательная бесконечность

        // double
        double d1 = 2.123_456_789; // Тип double в классическом виде
        double d2 = 4.05E-13; // Тип double в научном виде
        double d3 = .5; // Тип double эквивалентный 0.5
        double d4 = 3.; // Тип double эквивалентный 3.0
        double d5 = 0.0 / 0.0; // NaN - Not-a-Number
        double d6 = 1.0 / 0.0; // Infinity - бесконечность
        double d7 = -1.0 / 0.0; // -Infinity - отрицательная бесконечность

        // char
        char c1 = 'A'; // A (latin) Glyph
        char c2 = '\u0041'; // A (latin) Unicode Code
        char c3 = '\101'; // A (latin) Octal
        char c4 = 65; // A (latin) Decimal
        // char _ = 't'; // error: as of release 9, '_' is a keyword, and may not be used as an identifier
    }
}
