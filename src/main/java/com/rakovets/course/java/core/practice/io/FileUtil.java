package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileUtil {
    public void upperCaseConversion(Path file1, Path file2) {
        try (BufferedReader fileRead = new BufferedReader(new FileReader(file1.toFile()));
             BufferedWriter fileWrite = new BufferedWriter(new FileWriter(file2.toFile()))) {
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
        List<String> rowList = new ArrayList<>();
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

    public List<String> getListGreatestCombinationNumbersAscendingOrder(Reader file) {
        List<String> list2 = new ArrayList<>();
        try (BufferedReader fileRead = new BufferedReader(file)) {
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

    public Map<Character, Integer> getRepetitionRateLetterInTextIgnoreCase(Path file) throws IOException {
        Map<Character, Integer> map = new HashMap<>();
        String content = Files.readString(file)
                .toLowerCase()
                .replaceAll("[^a-z&а-я]", "");
        for (char symbol : content.toCharArray()) {
            map.put(symbol, map.getOrDefault(symbol, 0) + 1);
        }
        return map;
    }

    public Map<String, Integer> getRepetitionRateWordsInText(Path file) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        String content = Files.readString(file)
                .toLowerCase()
                .replaceAll("[^a-z&']", " ");
        List<String> list = List.of(content.split("\\s+"));
        for (String word : list) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(i -> sortedMap.put(i.getKey(), i.getValue()));
        return sortedMap;
    }
}
