package com.rakovets.course.java.core.example.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Example18PrintStream {
    public static void main(String[] args) {
        try (OutputStream fout = new FileOutputStream(ExampleFiles.OUTPUT_FILE);
             PrintStream pout = new PrintStream(fout)) {
            pout.println(2021);
            pout.println("Hell to world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
