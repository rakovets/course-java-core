package com.rakovets.java.practice.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task11 {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("Folder11.txt");
        int i;
        String text = "";
        while ((i = fi.read()) != -1) {
            text += (char) i;
        }
        fi.close();
        System.out.println(text);

        String replace = text.replace("public", "private");
        byte[] byffer = replace.getBytes();
        FileOutputStream fileOutputStream = new FileOutputStream("Task_11_replaceText");
        fileOutputStream.write(byffer);
        fileOutputStream.close();
    }
}
