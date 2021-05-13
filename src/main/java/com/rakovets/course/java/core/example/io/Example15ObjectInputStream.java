package com.rakovets.course.java.core.example.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Example15ObjectInputStream {
    public static void main(String[] args) {
        try (InputStream fis = new FileInputStream(ExampleFiles.TRANSFER_FILE);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object readObject = ois.readObject();
            System.out.println(readObject);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
