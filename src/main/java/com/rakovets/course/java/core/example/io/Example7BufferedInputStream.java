package com.rakovets.course.java.core.example.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example7BufferedInputStream {
    public static void main(String[] args) {
        try (InputStream fin = new FileInputStream(ExampleFiles.INPUT_FILE);
             InputStream bin = new BufferedInputStream(fin)) {
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
