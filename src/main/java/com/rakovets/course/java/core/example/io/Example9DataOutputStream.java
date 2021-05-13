package com.rakovets.course.java.core.example.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example9DataOutputStream {
    public static void main(String[] args) {
        try (FileOutputStream file = new FileOutputStream(ExampleFiles.TRANSFER_FILE);
             DataOutputStream data = new DataOutputStream(file)) {
            data.writeInt(12);
            data.writeDouble(12.34);
            data.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
