package com.rakovets.java.io;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ticket7 {
    public static void main(String[] args) {
        String text = "";
        int counter = 1;
        Map<Character, Integer> mapWithUniqueLetters = new HashMap();
        try(InputStream inputFile = new FileInputStream("Ticket7(in).txt");
            OutputStream outputFile = new FileOutputStream("Ticket7(out).txt")) {
            while (inputFile.available() > 0) {
                text += (char) inputFile.read();
            }
            String textWithoutPunctuationMarks = null;
            Pattern pattern = Pattern.compile("[a-z]");
            Matcher matcher = pattern.matcher(text.toLowerCase());
            while (matcher.find()) {
                textWithoutPunctuationMarks += matcher.group();
            }
            for (char letterFromText: textWithoutPunctuationMarks.toLowerCase().toCharArray()) {
                if (!mapWithUniqueLetters.containsKey(letterFromText)) {
                    mapWithUniqueLetters.put(letterFromText, counter);
                } else {
                    int newNumberOfLetter = mapWithUniqueLetters.get(letterFromText) + 1;
                    mapWithUniqueLetters.replace(letterFromText, newNumberOfLetter);
                }
            }
            byte[] textInByte = mapWithUniqueLetters.entrySet().toString().getBytes();
            outputFile.write(textInByte);
            for (Map.Entry<Character, Integer> item: mapWithUniqueLetters.entrySet()) {
                System.out.printf("[Letter: %s, count: %d]\n", item.getKey(), item.getValue());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
