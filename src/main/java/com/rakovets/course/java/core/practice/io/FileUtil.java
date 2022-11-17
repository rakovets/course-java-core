package com.rakovets.course.java.core.practice.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FileUtil {
    public void upperCaseConversion(Path fileReader, Path fileWriter) {
        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()));
             BufferedWriter fileWrite = new BufferedWriter(new FileWriter(fileWriter.toFile()))) {
            String str;
            while ((str = fileRead.readLine()) != null) {
                fileWrite.write(str.toUpperCase());
                fileWrite.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getRowList(Path fileReader) {
        List<String> rowList;
        rowList = new ArrayList<>();
        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()))) {
            String str;
            while ((str = fileRead.readLine()) != null) {
                rowList.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rowList;
    }

    public List<String> getListWordsFirstVowel(Path fileReader) {
        List<String> list = new ArrayList<>();
        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()))) {
            String str;
            while ((str = fileRead.readLine()) != null) {
                Arrays.stream(str.split("(\\W+)"))
                        .filter(i -> i.substring(0, 1).matches("(?i:[aeiouy])"))
                        .forEach(list::add);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getListWordsLastLetterWordCoincidesFirstLetterNextWord(Path fileReader) {
        List<String> list = new ArrayList<>();
        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()))) {
            String str;
            while ((str = fileRead.readLine()) != null) {
                Arrays.stream(str.split("(\\W+)"))
                        .forEach(list::add);
            }
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).toLowerCase().charAt(list.get(i).length() - 1)
                        != list.get(i + 1).toLowerCase().charAt(0)) {
                    list.remove(i);
                    i--;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getListGreatestCombinationNumbersAscendingOrder(Path fileReader) {
        List<String> list2 = new ArrayList<>();
        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()))) {
            String str;
            while ((str = fileRead.readLine()) != null) {
                TreeMap<Integer, String> map = new TreeMap<>();
                List<String> list = new ArrayList<>();
                String str2 = "";
                int count = 1;
                Arrays.stream(str.split("\\D+"))
                        .forEach(list::add);
                for (int i = 0; i < list.size() - 1; i++) {
                    if (Integer.valueOf(list.get(i)) < Integer.valueOf(list.get(i+1))) {
                        str2 += " " + list.get(i);
                        count++;
                    } else {
                        str2 += " " + list.get(i);
                        map.put(count, str2.trim());
                        str2 = "";
                        count = 1;
                    }
                }
                if (count > 1) {
                    str2 += " " + list.get(list.size() - 1);
                    map.put(count, str2.trim());
                } else {
                    map.put(count, list.get(list.size() - 1));
                }
                list2.add(map.get(map.lastKey()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list2;
    }

    public Map<Character, Integer> getRepetitionRateLetterInTextIgnoreCase(Path fileReader) {
        Map<Character, Integer> map = new HashMap<>();
        try {
            String strFromFile = Files.readString(fileReader)
                    .toLowerCase()
                    .replaceAll("[^a-z&а-я]", "");
            for (char symbol : strFromFile.toCharArray()) {
                map.put(symbol, map.getOrDefault(symbol, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public Map<String, Integer> getRepetitionRateWordsInText(Path fileReader) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        try {
            String strFromFile = Files.readString(fileReader)
                    .toLowerCase()
                    .replaceAll("[^a-z&']", " ");
            List<String> list = List.of(strFromFile.split("\\s+"));
            for (String word : list) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEach(i -> sortedMap.put(i.getKey(), i.getValue()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sortedMap;
    }

    public void sortedNumbersInFile(Path fileReader) {
        try {
            String strFromFile = Files.readString(fileReader)
                    .replaceAll("[^0-9]", " ");
            List<String> listStrNumbers = Arrays.asList(strFromFile.split("\\s+"));
            List<Integer> listIntNumbers = new ArrayList<>();
            for (String number : listStrNumbers) {
                listIntNumbers.add(Integer.valueOf(number));
            }
            Collections.sort(listIntNumbers);
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileReader + "_"))) {
                bufferedWriter.write(listIntNumbers.toString());
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, Double> getStudentsPerformance(Path fileReader) {
        Map<String, Double> performance = new HashMap<>();
        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()))) {
            String str;
            while ((str = fileRead.readLine()) != null) {
                List<String> students = new ArrayList<>();
                List<String> marks = new ArrayList<>();
                List<Integer> marksInt = new ArrayList<>();
                Arrays.stream(str.split("\\W+"))
                        .forEach(marks::add);
                students.add(marks.get(0));
                marks.remove(marks.get(0));
                for (String mark : marks) {
                    marksInt.add(Integer.valueOf(mark));
                }
                double average = marksInt.stream()
                        .mapToInt(a -> a)
                        .average().orElse(0);
                performance.put(students.get(0), average);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return performance;
    }

    public void codeEditor(Path fileReader, String modifierBefore, String modifierAfter) {
        try (BufferedReader fileRead = new BufferedReader(new FileReader(fileReader.toFile()));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileReader + "_"))) {
            String str;
            while ((str = fileRead.readLine()) != null) {
                if (str.contains("class")) {
                    fileWriter.write(str);
                    fileWriter.newLine();
                } else {
                    fileWriter.write(str.replaceAll(modifierBefore, modifierAfter));
                    fileWriter.newLine();
                }
            }
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
