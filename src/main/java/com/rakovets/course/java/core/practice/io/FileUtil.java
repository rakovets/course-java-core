package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.util.NumberUtil;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FileUtil {
    public static final Logger logger = Logger.getLogger(FileUtil.class.getName());

    public void copyToUpperCase(Path fileInput, Path fileOutput) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInput.toFile()));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOutput.toFile()))) {
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                bufferedWriter.write(text.toUpperCase() + "\n");
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
    }

    public List<String> getLinesFromFile(Path fileInput) {
        List<String> result = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInput.toFile()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
        return result;
    }

    public List<String> getWordsStartsWithVowel(Path fileInput) {
        List<String> result = new ArrayList<>();
        for (String str : getLinesFromFile(fileInput)) {
            Arrays.stream(str.split(" +"))
                    .filter(s -> s.substring(0, 1).matches("[AaEeUuIiOoYy]"))
                    .forEach(result::add);
        }
        return result;
    }

    public List<String> getWordsEndWithSameLetterNextWordStartWith(Path fileInput) {
        List<String> words = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (String str : getLinesFromFile(fileInput)) {
            words.addAll(Arrays.asList(str.replaceAll("[.,!?;:'\"]", "").split(" +")));
        }
        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).endsWith(words.get(i + 1).substring(0, 1).toLowerCase())) {
                result.add(words.get(i));
            }
        }
        return result;
    }

    public List<String> getNumberCombination(Path fileInput) {
        List<String> result = new ArrayList<>();
        for (String str : getLinesFromFile(fileInput)) {
            String[] words = str.split(" ");
            int[] numbers = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                numbers[i] = Integer.parseInt(words[i]);
            }
            int[] sorted = Arrays.stream(numbers).distinct()
                    .sorted()
                    .toArray();
            List<Integer> oneLine = new ArrayList<>();
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i + 1] - sorted[i] == 1 || sorted[i] - sorted[i - 1] == 1) {
                    oneLine.add(sorted[i]);
                }
            }
            result.add(oneLine.toString());
        }
        return result;
    }

    public Map<String, Integer> getLetterFrequency(Path fileInput) {
        List<String> letters = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInput.toFile()))) {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                char letter = Character.toLowerCase((char) c);
                letters.add(String.valueOf(letter));
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
        List<String> uniqueLetters = letters.stream()
                .filter(s -> s.matches("[a-z]"))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueLetters);
        Map<String, Integer> result = new HashMap<>();
        for (String s : uniqueLetters) {
            int frequency = 0;
            for (String value : letters) {
                if (s.equalsIgnoreCase(value)) {
                    frequency++;
                }
            }
            result.put(s, frequency);
        }
        return result;
    }

    public List<String> getWordFrequency(Path fileInput) {
        List<String> words = new ArrayList<>();
        for (String str : getLinesFromFile(fileInput)) {
            words.addAll(Arrays.asList(str.replaceAll("[.,!?;:'\"]", "").split(" +")));
        }
        List<String> uniqueWords = words.stream()
                .distinct()
                .collect(Collectors.toList());
        List<String> result = new ArrayList<>();
        for (String word : uniqueWords) {
            int frequency = 0;
            for (String value : words) {
                if (word.equals(value)) {
                    frequency++;
                }
            }
            result.add(frequency + " - " + word);
        }
        Collections.sort(result);
        return result;
    }

    public void sortAndCopy(Path fileInput, Path fileOutput) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader bufReader = new BufferedReader(new FileReader(fileInput.toFile()));
             BufferedWriter bufWriter = new BufferedWriter(new FileWriter(fileOutput.toFile()))) {
            String s;
            while ((s = bufReader.readLine()) != null) {
                for (String n : s.split(" ")) {
                    numbers.add(Integer.parseInt(n));
                }
            }
            Collections.sort(numbers);
            bufWriter.write(numbers.toString());
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
    }

    public Map<String, Double> getAverageMark(Path fileInput) {
        List<String> lines = getLinesFromFile(fileInput);
        Map<String, Double> result = new HashMap<>();
        for (String line : lines) {
            String[] oneStudent = line.split(",");
            double sum = 0.0;
            for (int i = 1; i < oneStudent.length; i++) {
                sum += Integer.parseInt(oneStudent[i]);
            }
            result.put(oneStudent[0], NumberUtil.roundValueToTwoDigitsForMantissa(sum / (oneStudent.length - 1)));
        }
        return result;
    }

    public void changeAccessModifier(Path fileInput, Path fileOutput, String modifier, String changeModifier) {
        List<String> lines = getLinesFromFile(fileInput);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutput.toFile()))) {
            for (String str : lines) {
                if (str.contains("class")) {
                    bw.write(str + "\n");
                } else {
                    bw.write(str.replaceAll(modifier, changeModifier) + "\n");
                }
            }
        } catch (IOException e) {
            logger.info(e.getMessage());
        }
    }
}
