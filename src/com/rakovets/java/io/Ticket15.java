package com.rakovets.java.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Ticket15 {
    public static void main(String[] args) {
        String text = "";
        int counter = 1;
        Map<String, Integer> mapWithUniqueWords = new HashMap();
        try(InputStream inputFile = new FileInputStream("Ticket15(in).txt");
            OutputStream outputFile = new FileOutputStream("Ticket15(out).txt")) {
            while (inputFile.available() > 0) {
                text += (char) inputFile.read();
            }
            String[] words = text.toLowerCase().split("[ .,:;]+|[ .,:;\r\n]");
            for (String word: words) {
                if (!mapWithUniqueWords.containsKey(word)) {
                    mapWithUniqueWords.put(word, counter);
                } else {
                    int newNumberOfLetter = mapWithUniqueWords.get(word) + 1;
                    mapWithUniqueWords.replace(word, newNumberOfLetter);
                }
            }
            mapWithUniqueWords.remove("");
            byte[] textInByte = mapWithUniqueWords.entrySet().toString().getBytes();
            outputFile.write(textInByte);
            for (Map.Entry<String, Integer> item: mapWithUniqueWords.entrySet()) {
                System.out.printf("[Word: %s, count: %d]\n", item.getKey(), item.getValue());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
