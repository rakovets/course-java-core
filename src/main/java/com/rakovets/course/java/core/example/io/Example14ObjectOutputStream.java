package com.rakovets.course.java.core.example.io;

import com.rakovets.course.java.core.example.io.model.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Example14ObjectOutputStream {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 180);
        try (OutputStream fos = new FileOutputStream(ExampleFiles.TRANSFER_FILE);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(tom);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
