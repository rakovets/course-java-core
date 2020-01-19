package com.rakovets.java.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Ticket1 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("Ticket1.txt")) {
            System.out.printf("File size: %d bytes\n", fileInputStream.available());
            int i;
            String text = "";
            while ((i = fileInputStream.read()) != -1) {
                text += (char) i;
            }
            String[] stringsOfTexts = text.split("\\.");
            for (String str: stringsOfTexts) {
                System.out.println(str);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
