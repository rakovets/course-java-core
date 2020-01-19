package com.rakovets.java.io;

import java.io.*;

public class Ticket6 {
    public static void main(String[] args) {
        String text = "";
        try(InputStream inputStream = new FileInputStream("Ticket6(in).txt");
            OutputStream outputStream = new FileOutputStream("Ticket6(out).txt")) {
            while (inputStream.available() > 0) {
                text += (char) inputStream.read();
            }
            StringBuffer buffer = new StringBuffer(text);
            buffer.reverse();
            byte[] textInBytes = buffer.toString().getBytes();
            outputStream.write(textInBytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
