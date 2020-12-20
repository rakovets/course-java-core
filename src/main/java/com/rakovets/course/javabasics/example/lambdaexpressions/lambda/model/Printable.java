package com.rakovets.course.javabasics.example.lambdaexpressions.lambda.model;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public interface Printable {
    void print(String s);

    static void printToStandardOutput(String s) {
        System.out.println(s);
    }

    default public void printUtf8To(String s, OutputStream outputStream) {
        try {
            outputStream.write(s.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException("Error writing String as UTF-8 to OutputStream", e);
        }
    }
}
