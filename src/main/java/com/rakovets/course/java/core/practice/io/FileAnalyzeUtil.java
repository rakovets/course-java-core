package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

}
