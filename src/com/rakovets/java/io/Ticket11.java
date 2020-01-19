package com.rakovets.java.io;

import java.io.*;

public class Ticket11 {
    public static void main(String[] args) {
        String text = "";
        String textWithReplacing;
        try(InputStream inputFile = new FileInputStream("Ticket11(in).txt");
            OutputStream outputFile = new FileOutputStream("Ticket11(out).txt")) {
            while (inputFile.available() > 0) {
                text += (char) inputFile.read();
            }
            textWithReplacing = text.replaceAll("public", "private");
            byte[] textInByte = textWithReplacing.getBytes();
            outputFile.write(textInByte);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
