package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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

    public static Map<Character, Integer> getLettersFrequency(String filePath) {
        String data = getList(filePath).toString().replaceAll("\\W", "").toLowerCase(Locale.ROOT);
        Map<Character, Integer> receiver = new HashMap<>();

        for (char x : data.toCharArray()) {
            Integer frequency = receiver.get(x);
            receiver.put(x, frequency == null ? 1 : frequency + 1);
        }
        return receiver;
    }

    public static List<String> getAscendingWordFrequency(String filePath) {
        String data = getList(filePath).toString().replaceAll("\\W", " ").toLowerCase(Locale.ROOT);
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

    public static boolean sortAndWriteNumbers(String filePath) {
        String data = getList(filePath).toString().replaceAll("\\D", " ");

        List<Integer> numbers = Arrays.stream(data.trim().split("\\s+"))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + "_"))) {
            bw.write(numbers.toString().replaceAll("[\\[\\]]", ""));
            bw.flush();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static List<String> getStudentAverageMark(String filePath) {
        List<String> receiver = new ArrayList<>();
        List<String> data = getList(filePath);

        for (String studentMarks : data) {
            String surname = studentMarks.replaceAll("[\\W\\d]","");
            double averageMark = 0.0;
            String[] marksString = studentMarks.replaceAll("\\D", " ").trim().split("\\s+");
            Optional<Integer> marks = Arrays.stream(marksString)
                    .map(Integer::parseInt)
                    .reduce(Integer::sum);

            if (marks.isPresent()) {
                averageMark = (double) marks.get() / marksString.length;
            }
            receiver.add(String.format("%s - average mark: %.2f", surname, averageMark));
        }
        return receiver;
    }

    public static boolean replaceModifiers(String filePath, String previous, String necessary) {
        List<String> receiver = getList(filePath).stream()
                .map(string -> string.replaceAll(previous, necessary))
                .collect(Collectors.toList());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath + "_"))) {
            for(String data : receiver) {
                bw.write(data + "\n");
            }
            bw.flush();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
