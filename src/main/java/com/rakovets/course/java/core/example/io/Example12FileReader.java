package com.rakovets.course.java.core.example.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example12FileReader {
    public static void main(String[] args) {
        try (Reader fr = new FileReader(ExampleFiles.INPUT_FILE)) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
