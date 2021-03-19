package com.rakovets.course.java.core.example.data_types;

public class Example4OtherNumberSystems {
    public static void main(String[] args) {
        int decimalNumber = 42; // Decimal declaration and possible chars are [0-9]
        int binaryNumber = 0b101010; // Binary representation starts with 0B or 0b and possible chars are [0-1]
        int octalNumber = 052; // Octal declaration starts with 0 and possible chars are [0-7]
        int hexadecimalNumber = 0x2A; // Hexadecimal declaration starts with 0X or 0x and possible chars are [0-9A-Fa-f]
        System.out.printf("Decimal: %d\n", decimalNumber);
        System.out.printf("Binary: %d\n", binaryNumber);
        System.out.printf("Octal: %d\n", octalNumber);
        System.out.printf("Hexadecimal: %d\n", hexadecimalNumber);
    }
}
