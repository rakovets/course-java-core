package com.rakovets.course.java.core.practice.io.file_util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtil {
    public static final Logger logger = Logger.getLogger(FileUtil.class.getName());

    public void rewriteContents(String text, String text2) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(text));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(text2))) {
            String newText;
            while ((newText = bufferedReader.readLine()) != null) {
                bufferedWriter.write(newText.toUpperCase(Locale.ROOT));
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
        }
    }

    public List<String> getListStringFromFile(String way) {
        List<String> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(way));
            String newText;
            while ((newText = bufferedReader.readLine()) != null) {
                list.add(newText);
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
        }
        return list;
    }

    public List<String> getListStringVowel(String way) {
        List<String> list = new ArrayList<>();
        for (String text : getListStringFromFile(way)) {
            Arrays.stream(text.split(" "))
                    .filter(i -> i.substring(0, 1)
                            .matches("[aeiouyAEIOUY]"))
                    .forEach(list::add);
        }
        return list;
    }

    public List<String> getListWordWithSameLetters(String way) {
        List<String> list = new ArrayList<>();
        for (String text : getListStringFromFile(way)) {
            String[] nj = text.split(" ");
            for (int i = 0; i < nj.length - 1; i++) {
                String[] nm = nj[i].split("");
                for (int j = 0; j < nm.length - 1; j++) {
                    String temp = nm[nm.length - 1];
                    if (nj[i + 1].startsWith(temp)) {
                        list.add(nj[i]);
                        break;
                    }
                }
            }
        }
        return list;
    }

    public List<String> getLargestCombinationNumbers(String way) {
        List<String> list = getListStringFromFile(way);
        List<String> largestCombinationNumbers = new LinkedList<>();

        for (String text : list) {
            String textOfNumbers = "";
            int startIndex = 0;
            int endIndex = 0;
            int currentLength = 0;
            String[] numbers = text.split(" ");
            for (int i = 1; i < numbers.length; i++) {
                if (Integer.parseInt(numbers[i]) > Integer.parseInt(numbers[i - 1])) {
                    currentLength++;
                } else if (currentLength >= (endIndex - startIndex)) {
                    endIndex = i;
                    startIndex = i - currentLength - 1;
                    currentLength = 0;
                }
            }
            if (currentLength >= (endIndex - startIndex)) {
                endIndex = numbers.length;
                startIndex = numbers.length - currentLength - 1;
            }
            for (int i = startIndex; i <= endIndex; i++) {
                textOfNumbers = i == endIndex
                        ? String.join(" ", Arrays.copyOfRange(numbers, startIndex, endIndex))
                        : String.join(" ", Arrays.copyOfRange(numbers, startIndex, endIndex)) + " ";
            }
            largestCombinationNumbers.add(textOfNumbers);
        }
        return largestCombinationNumbers;
    }

    public Map<Character, Integer> getCountCharFrequency(String fileName) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            return lines
                    .flatMapToInt(String::chars)
                    .mapToObj(c -> (char) c)
                    .filter(Character::isLetter)
                    .collect(Collectors.groupingBy(
                            Character::toLowerCase,
                            Collectors.summingInt(c -> 1)
                    ));
        }
    }

    public Map<String, Integer> getCountOfWordsCharFrequency(String way) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = getListStringFromFile(way);

        Integer value;

        for (String stringOfWord : list) {
            String[] text = stringOfWord.split(" ");
            for (String word : text) {
                value = map.get(word);
                if (value == null) {
                    map.put(word.toLowerCase(), 1);
                } else {
                    map.put(word.toLowerCase(), value + 1);
                }
            }
        }
        return map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    public void getSortInAscendingOrder(String way, String pattern) {
        List<String> list = getListStringFromFile(way);
        List<Integer> integerList = list.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(way.concat(pattern)))) {
            bufferedWriter.write(integerList.toString());
            bufferedWriter.flush();
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
        }
    }

    public List<String> getStudentPerformance(String students) {
        List<String> list = getListStringFromFile(students);
        Map<String, Integer> map = new HashMap<>();
        for (String lineWithMarks : list) {
            String[] stringsOfStudent = lineWithMarks.replace("\\D", "").trim().split(",");
            for (String mark : stringsOfStudent) {

            }
        }
        return list;
    }
}
