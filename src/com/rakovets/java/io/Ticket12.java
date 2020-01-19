package com.rakovets.java.io;

import java.io.*;

public class Ticket12 {
    public static void main(String[] args) {
        String text = "";
        try(InputStream inputFile = new FileInputStream("Ticket12(in).txt");
            OutputStream outputFile = new FileOutputStream("Ticket12(out).txt")) {
            while (inputFile.available() > 0) {
                text += (char) inputFile.read();
            }
            StringBuffer buffer = new StringBuffer(text);
            buffer.reverse();
            byte[] textInByte = buffer.toString().getBytes();
            outputFile.write(textInByte);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
