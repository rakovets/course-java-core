package com.rakovets.course.java.core.example.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example13BufferedWriter {
    public static void main(String[] args) {
        try (Writer fw = new FileWriter(ExampleFiles.OUTPUT_FILE);
             Writer bw = new BufferedWriter(fw)) {
            bw.write("Hell to world by BufferedWriter!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
