package com.rakovets.java.practice.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

public class Task08 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Task8_RandomNumbers");
        PrintStream printStream = new PrintStream(fileOutputStream);
        Random random = new Random();
        Integer[] arraylist = new Integer[50];
        for (int i = 0; i < arraylist.length; i++) {
            arraylist[i] = random.nextInt(1000);
        }
        Arrays.sort(arraylist);
        for (int i = 0; i < arraylist.length; i++) {
            printStream.println(arraylist[i]);
        }
        printStream.close();
        fileOutputStream.close();
    }
}
