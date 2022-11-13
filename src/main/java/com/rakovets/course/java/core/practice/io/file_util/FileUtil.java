package com.rakovets.course.java.core.practice.io.file_util;

import com.rakovets.course.java.core.util.NumberUtil;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FileUtil {
    private final Logger logger = Logger.getLogger(FileUtil.class.getName());

    /**
     * The method takes paths to two files and rewrites the contents of one file to another file in upper case.
     *
     * @param initialPath path to original data file
     * @param targetPath  path to the target file where the original data is overwritten in upper case
     */
    public void overrideDataToUpperCase(Path initialPath, Path targetPath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(initialPath.toFile()));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetPath.toFile()))) {
            String readableText;

            while ((readableText = bufferedReader.readLine()) != null) {
                bufferedWriter.write(readableText.toUpperCase() + "\n");
            }
        } catch (IOException exception) {
            logger.info(exception.getMessage());
        }
    }

    /**
     * Method takes a path to a file and returns a list of lines in that file.
     *
     * @param path path to original data file
     * @return list of lines retrieved from file
     */
    public List<String> convertTextToListOfString(Path path) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
            String readableText;

            while ((readableText = bufferedReader.readLine()) != null) {
                list.add(readableText);
            }
        } catch (IOException exception) {
            logger.info(exception.getMessage());
        }
        return list;
    }

    /**
     * Method takes a path to a file and returns a list of words starting with a vowel.
     *
     * @param path path to original data file
     * @return list of words starting with a vowel
     */
    public List<String> extractWordsWithVowelsFromPath(Path path) {
        List<String> list = new ArrayList<>();

        String[] words = convertTextToListOfString(path).toString()
                .replaceAll("[,.?!@#$%^&*()]", "").split(" ");
        Arrays.stream(words)
                .filter(i -> i.matches("^[AaEeIiOoUuYy].*"))
                .forEach(list::add);

        return list;
    }

    /**
     * Method takes a path to a file.
     * Returns a list of words for which the last letter matches the first letter of the word following it.
     *
     * @param path path to original data file
     * @return list of words for which the last letter matches the first letter of the word following it
     */
    public List<String> extractWordLastLetterEqualsFirstLetterNextWord(Path path) {
        List<String> listOfInitialWords = new ArrayList<>();
        List<String> listOfExtractWords = new ArrayList<>();

        for (String word : convertTextToListOfString(path)) {
            listOfInitialWords.addAll(Arrays.asList(word
                    .replaceAll("[,.?!@#$%^&*()]", "")
                    .split(" ")));
        }

        for (int i = 0; i < listOfInitialWords.size() - 1; i++) {
            if (listOfInitialWords.get(i)
                    .endsWith(listOfInitialWords.get(i + 1)
                            .substring(0, 1)
                            .toLowerCase())) {
                listOfExtractWords.add(listOfInitialWords.get(i));
            }
        }
        return listOfExtractWords;
    }

    /**
     * The method returns a list of the largest combination of digits for each string, in ascending order.
     *
     * @param path path to original data file
     * @return list of the largest combination of digits for each string, in ascending order
     */
    public List<String> extractCombinationNumbersInAscendingOrder(Path path) {
        List<String> listOfNumbersCombination = new ArrayList<>();
        List<String> listOfConvertedLine = convertTextToListOfString(path);

        for (String line : listOfConvertedLine) {
            String[] lines = line.trim().split(" ");
            int number = Integer.parseInt(lines[0]);
            String combination = lines[0];
            Map<String, Integer> map = new HashMap<>();
            int counter = 1;
            map.put(combination, counter);

            for (int x = 1; x < lines.length; x++) {
                if (Integer.parseInt(lines[x]) > number) {
                    combination += " " + lines[x];
                    counter += 1;
                } else {
                    counter = 1;
                    combination = lines[x];
                }
                number = Integer.parseInt(lines[x]);
                map.put(combination, counter);
            }

            map.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(1)
                    .map(Map.Entry::getKey)
                    .forEach(listOfNumbersCombination::add);
        }
        return listOfNumbersCombination;
    }

    /**
     * The method takes a path to a file and returns the frequency of occurrence of all letters in the text, ignoring case.
     *
     * @param path path to original data file
     * @return frequency of occurrence of all letters in the text, ignoring case
     */
    public Map<Character, Integer> calculationFrequencyRepetitionAllLettersIgnoringCase(Path path) {
        Map<Character, Integer> map = new HashMap<>();
        String letters = convertTextToListOfString(path)
                .toString()
                .toLowerCase()
                .replaceAll("[^a-z]", "");

        for (int i = 0; i < letters.length(); i++) {
            map.put(letters.charAt(i), map.getOrDefault(letters.charAt(i), 0) + 1);
        }

        return map;
    }

    /**
     * The method returns the frequency of occurrence of all words in the text in ascending order.
     *
     * @param path path to original data file
     * @return frequency of occurrence of all words in the text in ascending order
     */
    public Map<String, Integer> calculationFrequencyWordsAscendingOrder(Path path) {
        Map<String, Integer> map = new HashMap<>();
        String words = convertTextToListOfString(path)
                .toString()
                .replaceAll("\\W", " ");
        String[] arrayWords = words.trim().split("\\s+");

        for (String word : arrayWords) {
            if (word != null) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        Map<String, Integer> sortedArrayWords = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(entry -> sortedArrayWords.put(entry.getKey(), entry.getValue()));
        return sortedArrayWords;
    }

    /**
     * The method takes a file path with integers and sorts the contents of the file in ascending order.
     * The result is saved to the file ${origin_filepath}_
     *
     * @param path path to original data file
     */
    public void sortIntegersAscendingOrderFromFileToAnother(Path path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path.toFile()))) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + "_"))) {
                String string = new String();

                while ((string = bufferedReader.readLine()) != null) {
                    String[] arrayIntegers = string.split(" ");
                    List<Integer> sortedIntegers = Arrays.stream(arrayIntegers)
                            .map(Integer::parseInt)
                            .sorted()
                            .collect(Collectors.toList());
                    bufferedWriter.write(sortedIntegers.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * The method count average marks of students.
     *
     * @param path path to original data file
     * @return average marks of student(-s)
     */
    public Map<String, Double> countStudentsAverageMarks(Path path) {
        List<String> listOfString = convertTextToListOfString(path);
        Map<String, Double> result = new HashMap<>();

        for (String line : listOfString) {
            String[] student = line.split(",");
            double sumOfMarks = 0.0;

            for (int i = 1; i < student.length; i++) {
                sumOfMarks += Integer.parseInt(student[i]);
            }
            result.put(student[0], NumberUtil.roundValueToTwoDigitsForMantissa(sumOfMarks / (student.length - 1)));
        }

        return result;
    }

    /**
     * The method takes in parameters the path to the file with java code, and 2 access modifiers as a string.
     * Replaces all "X" access modifiers in class attribute and method declarations with "Y".
     * Saves the result to ${origin_filepath}_.
     *
     * @param path path to original data file
     * @param initialModifier type of initial modifier
     * @param targetModifier  type of target modifier
     */
    public void changeAccessModifier(Path path, String initialModifier, String targetModifier) {
        List<String> listLines = convertTextToListOfString(path);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + "_"))) {
            for (String line : listLines) {
                if (line.contains("class")) {
                    bufferedWriter.write((line) + "\n");
                } else {
                    bufferedWriter.write((line.replaceAll(initialModifier, targetModifier)) + "\n");
                    bufferedWriter.flush();
                }
            }
        } catch (IOException exception) {
            logger.info(exception.getMessage());
        }
    }
}
