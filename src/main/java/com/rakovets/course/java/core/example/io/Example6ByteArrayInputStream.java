package com.rakovets.course.java.core.example.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example6ByteArrayInputStream {
    public static void main(String[] args) {
        try (OutputStream fos = new FileOutputStream(ExampleFiles.OUTPUT_FILE);
             OutputStream fos2 = new FileOutputStream(ExampleFiles.TRANSFER_FILE);
             ByteArrayOutputStream bout = new ByteArrayOutputStream()) {

            bout.write("Hell to world!".getBytes());
            bout.writeTo(fos);
            bout.writeTo(fos2);

            bout.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
