package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FileAnalyzerUtil {

    public static List<String> getList(String nameFile) {
        List<String> list = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader(nameFile))) {
            String str;
            while ((str = read.readLine()) != null) {
                list.add(str);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public static List<String> getListGreatLetter(String nameFile) {
        List<String> list = new ArrayList<>();
        Arrays.stream(getList(nameFile).toString().toLowerCase(Locale.ROOT).split("\\W"))
                .filter(j -> j.matches("[aeiouy](.*)")).forEach(list::add);

        return list;
    }

    public static List<String> getCloneFirstAndLast(String nameFile) {
        List<String> receiver = new ArrayList<>();
        String data = getList(nameFile).toString();
        Pattern punctuationDeleting = Pattern.compile("[,.!?*\\-:\\[\\]+]");
        Matcher matcher = punctuationDeleting.matcher(data);
        String dataNew = matcher.replaceAll("");
        String[] arr = dataNew.split(" ");

        for (int i = 0; i < arr.length - 1; i++) {
            char c1 = arr[i].charAt(0);
            char c2 = arr[i + 1].charAt(arr[i + 1].length() - 1);
            if (c1 == c2) {
                receiver.add(arr[i] + " " + arr[i + 1]);
            }
        }
        return receiver;
    }

    public static Map<Character, Integer> getLetters(String nameFile) {
        String data = getList(nameFile).toString().replaceAll("\\W", "")
                .toLowerCase(Locale.ROOT);
        Map<Character, Integer> receiver = new HashMap<>();

        for (char x : data.toCharArray()) {
            Integer frequency = receiver.get(x);
            receiver.put(x, frequency == null ? 1 : frequency + 1);
        }
        return receiver;
    }

    public static List<String> getWord(String nameFile) {
        String data = getList(nameFile).toString().replaceAll("\\W", " ")
                .toLowerCase(Locale.ROOT);
        String[] wordArray = data.trim().split("\\s+");

        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : wordArray) {
            Integer frequency = wordMap.get(word);
            wordMap.put(word, frequency == null ? 1 : frequency + 1);
        }
        return wordMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(entry -> String.format("'%s' - %d", entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    public static boolean sortNumbers(String nameFile) {
        String data = getList(nameFile).toString().replaceAll("\\D", " ");

        List<Integer> numbers = Arrays.stream(data.trim().split("\\s+"))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile + "_"))) {
            bw.write(numbers.toString().replaceAll("[\\[\\]]", ""));
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
