package com.rakovets.course.java.core.example.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Example17PrintWriter {
    public static void main(String[] args) {
        double[] javaVersions = {1.1, 1.22, 1.333, 1.4444, 5.0};
        try (FileWriter fw = new FileWriter(ExampleFiles.OUTPUT_FILE, false);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {
            for (double version : javaVersions) {
                pw.printf("Java %.2g\n", version);
            }
        } catch (IOException e) {
            System.err.println("ошибка открытия потока " + e);
            System.exit(1);
        }
    }
}
