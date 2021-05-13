package com.rakovets.course.java.core.example.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example10DataInputStream {
    public static void main(String[] args) {
        try (InputStream fis = new FileInputStream(ExampleFiles.TRANSFER_FILE);
             DataInputStream dis = new DataInputStream(fis)) {
            int readInt = dis.readInt();
            double readDouble = dis.readDouble();
            System.out.println(readInt);
            System.out.println(readDouble);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
