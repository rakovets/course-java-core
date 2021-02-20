package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {
    public static List<String> getListOfStrings(String path) {
        List<String> listOfStrings = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = br.readLine()) != null) {
                listOfStrings.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return listOfStrings;
    }

    public static List<String> getListOfWordsWithFirstVowel(String path) {
        List<String> list = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = br.readLine()) != null) {
                for (String word : s.split("\\W")) {
                    if (word.toLowerCase().charAt(0) == 'a' || word.toLowerCase().charAt(0) == 'e' || word.toLowerCase().charAt(0) == 'i' || word.toLowerCase().charAt(0) == 'o' || word.toLowerCase().charAt(0) == 'u' || word.toLowerCase().charAt(0) == 'y') {
                        list.add(word);
                    }
                }

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public static List<String> getListOfWordsWithStartAndEndChar(String path) {
        List<String> list = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] arrayWords = s.split("\\W");
                for (int i = 0; i < arrayWords.length - 1; i++) {
                    if(arrayWords[i].charAt(arrayWords[i].length() - 1) == arrayWords[i + 1].charAt(0)) {
                        list.add(arrayWords[i]);
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public static List<String> getMaxConsistencyOfNumbers(String path) {
        List<String> list = new LinkedList<>();
        int counter = 0;
        int counterMax = 0;
        String maxNum = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] arrayWords = s.split(" ");
                for (int i = 1; i < arrayWords.length; i++) {
                    if (Integer.parseInt(arrayWords[i]) > Integer.parseInt(arrayWords[i - 1])) {
                        maxNum = maxNum + arrayWords[i] + " ";
                    } else {
                        maxNum = maxNum + arrayWords[i] + " | ";
                        list.add(maxNum);
                        maxNum = "";
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public static Map<Character, Integer> getNumbersOfChars(String path) {
        Map<Character, Integer> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int i;
            while ((i = br.read()) != -1) {
                if (map.containsKey(Character.toLowerCase((char) i))) {
                    map.put((Character.toLowerCase((char) i)), map.get(Character.toLowerCase((char) i)) + 1);
                } else if ((char) i != '\n' && (char) i != ' '){
                    map.put((Character.toLowerCase((char) i)), 1);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return map;
    }

    public static Map<String, Integer> getNumberOfWords(String path) {
        Map<String, Integer> map = new LinkedHashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] arrayWords = s.split("\\W");
                for (String arrayWord : arrayWords) {
                    if (map.containsKey(arrayWord)) {
                        map.put(arrayWord, map.get(arrayWord) + 1);
                    } else {
                        map.put(arrayWord, 1);
                    }
                }
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static void getSortNumbers(String path) {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] arrayNumbers = s.split(" ");
                for (String arrayNumber : arrayNumbers) {
                    list.add(Integer.parseInt(arrayNumber));
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Collections.sort(list);
        try (FileOutputStream fos = new FileOutputStream("src/test/java/com/rakovets/course/java/core/practice/io/filesForFileAnalyzer/sort-numbers_.txt")) {
            byte[] buffer = list.toString().getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
