package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileAnalyzeUtil {
    public static List<String> getListOfFileStrings(String filePath) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String s;
            while ((s = reader.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException ex) {
            System.out.println("There is a problem with reading strings");
        }
        return list;
    }

    public static List<String> getWordsStartingWithVowels(String filePath) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String str = "";
            int c;
            while ((c = reader.read()) != -1) {
                str += (char) c;
            }
            Pattern pattern = Pattern.compile("\\b[AaOoIiUuYyEe](\\w*)");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                list.add(matcher.group());
            }
        } catch (IOException ex) {
            System.out.println("There is a problem with highlighting words that begin with vowels");
        }
        return list;
    }

    public static List<String> getListOfWordsLastLitterSameWithFirstLitterNextWord(String filePath) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String str = "";
            int c;
            while ((c = reader.read()) != -1) {
                str += (char) c;
            }

            Pattern pattern1 = Pattern.compile("[,.!?-]");
            Matcher matcher1 = pattern1.matcher(str);
            String str1 = matcher1.replaceAll("");

            Pattern pattern2 = Pattern.compile("\\s+");
            Matcher matcher2 = pattern2.matcher(str1);
            String str2 = matcher2.replaceAll(" ").trim();
            String str3 = str2.toLowerCase();

            char[] bufWithCase = str2.toCharArray();
            char[] bufWithoutCase = str3.toCharArray();

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
            System.out.println("There is a problem with highlighting words that begin with vowels");
        }
        return list;
    }

}
