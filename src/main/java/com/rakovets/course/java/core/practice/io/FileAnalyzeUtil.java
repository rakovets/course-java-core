package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class FileAnalyzeUtil {

    public static List<String> getList(String filePath) {
        List<String> receiver = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String string;
            while ((string = reader.readLine()) != null) {
                receiver.add(string);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return receiver;
    }

    public static List<String> getListStartsWithVowels(String filePath) {
        List<String> receiver = new ArrayList<>();

        Arrays.stream(getList(filePath).toString().toLowerCase(Locale.ROOT).split("\\W"))
                .filter(word -> word.matches("[aeiouy](.*)"))
                .forEach(receiver::add);

        return receiver;
    }

    public static List<String> getListLastLetterEqualsFirstLetter(String filePath) {
        List<String> receiver = new ArrayList<>();

        String data = getList(filePath).toString();
        Pattern punctuationDeleting = Pattern.compile("[,.!?*\\-:\\[\\]+]");
        Matcher matcher = punctuationDeleting.matcher(data);
        String examplePure = matcher.replaceAll("");

        String[] exampleArray = examplePure.trim().split("\\s+");
        String first = exampleArray[0];

        for (int x = 1; x < exampleArray.length; x++) {
            if (first.charAt(first.length() - 1) == exampleArray[x].charAt(0)) {
                if (receiver.isEmpty() || !receiver.get(receiver.size() - 1).equals(first)) {
                    receiver.add(first);
                }
                receiver.add(exampleArray[x]);
            }
            first = exampleArray[x];
        }
        return receiver;
    }

    public static List<String> getLongestAscendingCombination(String filePath) {
        List<String> receiver = new ArrayList<>();

        List<String> data = getList(filePath);
        for (String string : data) {
            String examplePure = string.replaceAll("\\D", " ");

            String[] exampleArray = examplePure.trim().split("\\s+");
            int first = Integer.parseInt(exampleArray[0]);
            String combination = exampleArray[0];
            Map <String, Integer> results = new HashMap<>();
            int count = 1;
            results.put(combination, count);

            for (int x = 1; x < exampleArray.length; x++) {
                if (Integer.parseInt(exampleArray[x]) > first){
                    combination += " " + exampleArray[x];
                    count += 1;
                } else {
                    count = 1;
                    combination = exampleArray[x];
                }
                first = Integer.parseInt(exampleArray[x]);
                results.put(combination, count);
            }

            results.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(1)
                    .map(Map.Entry::getKey)
                    .forEach(receiver::add);
        }
        return receiver;
    }

}
