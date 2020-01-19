package com.rakovets.java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ticket8 {
    public static void main(String[] args) {
        Random random = new Random();
        try(OutputStream outputFile = new FileOutputStream("Ticket8(out).txt")) {
            PrintStream printStream = new PrintStream(outputFile);
            Integer[] arrayWithNumbers = new Integer[20];
            for (int i = 0; i < arrayWithNumbers.length; i++) {
                arrayWithNumbers[i] = random.nextInt(100);
            }
            Arrays.sort(arrayWithNumbers);
            for (Integer value: arrayWithNumbers) {
                printStream.println(value);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
