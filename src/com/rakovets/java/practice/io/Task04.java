package com.rakovets.java.practice.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Task04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("Fold4.txt.txt");
        int i;
        String text = "";
        while ((i = fi.read()) != -1) {
            text += (char) i;
        }
        fi.close();
        System.out.println(text);


        int counter = 0;
        String[] litersWords = text.split("[\\s a-zA-Z , . ; :]+\\s");
        for (String string : litersWords) {
            if (counter < string.length()) {
                counter = string.length();
            }
        }
        System.out.println("Bigest number digital : " + " " + counter);
    }
}

