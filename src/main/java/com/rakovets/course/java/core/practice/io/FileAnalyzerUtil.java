package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FileAnalyzerUtil {
    public static List<String> getListOfStrings(Path filePath) {
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                list.add(currentLine);
            }
        } catch (IOException ex) {
            System.out.println("Problem with string");
        }
        return list;
    }

    public static List<String> getWordStartsWithVowel(Path filePath) {
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String string = "";
            int c;
            while ((c = reader.read()) != -1) {
                string += (char) c;
            }
            Pattern pattern = Pattern.compile("\\b[AaEeIiOoUuYy](\\w*)");
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                list.add(matcher.group());
            }
        } catch (IOException ex) {
            System.out.println("Problem with words begins with vowels");
        }
        return list;
    }

    public static List<String> getListOfWordsWithSameLastAndFirstLetters(Path filePath) {
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(filePath)))) {
            String string = "";
            int number;
            while ((number = reader.read()) != -1) {
                string += (char) number;
            }

            Pattern pattern = Pattern.compile("[.?,!]");
            Matcher matcher = pattern.matcher(string);
            String string1 = matcher.replaceAll("");

            Pattern pattern1 = Pattern.compile("\\s+");
            Matcher matcher1 = pattern1.matcher(string1);
            String string2 = matcher1.replaceAll(" ").trim();
            String string3 = string2.toLowerCase();

            char[] bufWithCase = string2.toCharArray();
            char[] bufWithoutCase = string3.toCharArray();

            for (int i = 1, j = 0; i <= bufWithoutCase.length - 2; i++) {
                if (bufWithoutCase[i] == ' ') {
                    if (bufWithoutCase[i - 1] == bufWithoutCase[i + 1]) {
                        String word = "";
                        for (; j < i; j++) {
                            word += (char) bufWithCase[j];
                        }
                        list.add(word);
                    }
                    j = i + 1;
                }
            }
        } catch (IOException ex) {
            System.out.println("Problem with words begins with vowels");
        }
        return list;
    }

}
