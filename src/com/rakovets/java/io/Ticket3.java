package com.rakovets.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ticket3 {
    public static void main(String[] args) {
        try(InputStream fileInputStream = new FileInputStream("Ticket3.txt")) {
            int i;
            String text = "";
            while ((i = fileInputStream.read()) != -1) {
                text += (char) i;
            }
            String[] words = text.split("[\\.\\s\\,]+\\s*");
            for (int j = 1, k = 0; j < words.length && k < words.length; j++, k++) {
                int lastIndexOfWord = words[k].length() - 1;
                char lastCharInWord = words[k].toLowerCase().charAt(lastIndexOfWord);
                String strWithLastChar = "" + lastCharInWord;
                char firstIndexOfWord = words[j].toLowerCase().charAt(0);
                String strWithFirstChar = "" + firstIndexOfWord;
                if (strWithLastChar.equals(strWithFirstChar)) {
                    System.out.printf("Words with identical last and first char: %s, %s\n", words[k], words[j]);
                }
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
