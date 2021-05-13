package com.rakovets.course.java.core.example.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example11FileWriter {
    public static void main(String[] args) {
        try (Writer fw = new FileWriter(ExampleFiles.OUTPUT_FILE)) {
            fw.write("Hell to world by FileWriter!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
