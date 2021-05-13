package com.rakovets.course.java.core.example.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example4ClosingStream {
    public static void main(String[] args) {
        InputStream fin = null;
        try {
            fin = new FileInputStream(ExampleFiles.INPUT_FILE);
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
