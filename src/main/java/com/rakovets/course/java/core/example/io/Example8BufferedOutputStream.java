package com.rakovets.course.java.core.example.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example8BufferedOutputStream {
    public static void main(String[] args) {
        try (OutputStream fout = new FileOutputStream(ExampleFiles.OUTPUT_FILE);
             OutputStream bout = new BufferedOutputStream(fout)) {
            String s = "Hell to world by BufferedOutputStream!";
            byte[] stringAsBytes = s.getBytes();
            bout.write(stringAsBytes);
            bout.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
