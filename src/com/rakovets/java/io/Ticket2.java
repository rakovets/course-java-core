package com.rakovets.java.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Ticket2 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("Ticket2.txt")) {
            System.out.printf("File size: %d bytes\n", fileInputStream.available());
            int i;
            String stringWithVowel = "aeiou";
            String text = "";
            while ((i = fileInputStream.read()) != -1) {
                text += (char) i;
            }
            String[] words = text.split("[\\.\\s\\,]+\\s*");
            for (String wordFromArray: words) {
                char firstCharInWord = wordFromArray.toLowerCase().charAt(0);
                String strWithFirstChar = "" + firstCharInWord;
                if (stringWithVowel.contains(strWithFirstChar)) {
                    System.out.println(wordFromArray);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
