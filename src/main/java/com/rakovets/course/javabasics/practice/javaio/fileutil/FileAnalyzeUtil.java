package com.rakovets.course.javabasics.practice.javaio.fileutil;

import com.rakovets.course.javabasics.practice.javaio.fileutil.comparators.HashMapComparator;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {
    private File file;

    public FileAnalyzeUtil(File file) {
        this.file = file;
    }

    public static StringBuilder getRowsFromFileToString(String path) throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader(path));
        String res;
        StringBuilder result = new StringBuilder();
        while ((res = fileReader.readLine()) != null) {
            result.append(res + "\n");
        }
        fileReader.close();
        return result;
    }

    public static StringBuilder getWordsStartWithVowels(String path) throws IOException {

        String stringText = getRowsFromFileToString(path).toString();
        StringBuilder result = new StringBuilder();
        String[] array = stringText.split("[^a-zA-Z]+");
        String[] ch = {"E", "e", "Y", "y", "U", "u", "I", "i", "O", "o", "A", "a"};
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < ch.length; i++) {
                if (array[j].startsWith(ch[i])) {
                    result.append(array[j] + " ");
                }
            }
        }
        return result;
    }

    public static StringBuilder getWordsLastFirstEquals(String path) throws IOException {

        String stringText = getRowsFromFileToString(path).toString();
        StringBuilder result = new StringBuilder();
        String[] array = stringText.split("[^a-zA-Z]+");
        for (int i = 0; i < array.length - 1; i++) {
            String firstSimbol = String.valueOf(array[i + 1].charAt(0));
            if (array[i].endsWith(firstSimbol)) {
                result.append(array[i] + " ");
            }
        }
        return result;
    }

    public static HashMap<String, Integer> getCountOfsimbols(String path) throws IOException {

        BufferedReader file = new BufferedReader(new FileReader(path));
        StringBuilder stringB = new StringBuilder();
        HashMap<String, Integer> simbMap = new HashMap<>();
        int res;
        while ((res = file.read()) != -1) {
            stringB.append((char) res + " ");
        }
        String[] stringArray = stringB.toString().split("[^a-zA-Z]+");
        int countValue;
        for (String simb : stringArray) {
            if (simbMap.containsKey(simb)) {
                countValue = simbMap.get(simb);
                countValue++;
                simbMap.put(simb, countValue);
            } else
                simbMap.put(simb, 1);
        }
        file.close();
        return simbMap;
    }

    public static LinkedList<Map.Entry<String, Integer>> getCountOfSimbolsSorted(String path) throws IOException {

        BufferedReader file = new BufferedReader(new FileReader(path));
        StringBuilder stringB = new StringBuilder();
        HashMap<String, Integer> simbMap = new HashMap<>();
        int res;
        while ((res = file.read()) != -1) {
            stringB.append((char) res);
        }
        String[] stringArray = stringB.toString().split("[^a-zA-Z]+");
        int countValue;
        for (String simb : stringArray) {
            if (simbMap.containsKey(simb)) {
                countValue = simbMap.get(simb);
                countValue++;
                simbMap.put(simb, countValue);
            } else
                simbMap.put(simb, 1);
        }
        file.close();
        LinkedList<Map.Entry<String, Integer>> list = new LinkedList<>(simbMap.entrySet());
        list.sort(new HashMapComparator());
        return list;
    }
}
