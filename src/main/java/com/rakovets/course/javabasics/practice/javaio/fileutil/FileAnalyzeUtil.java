package com.rakovets.course.javabasics.practice.javaio.fileutil;

import com.rakovets.course.javabasics.practice.javaio.fileutil.comparators.HashMapComparator;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzeUtil {

    public static LinkedList<String> getRowsFromFileToString(String path) throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader(path));
        String res;
        LinkedList<String> result = new LinkedList<>();
        while ((res = fileReader.readLine()) != null) {
            result.add(res);
        }
        fileReader.close();
        return result;
    }

    public static LinkedList<String> getWordsStartWithVowels(String path) throws IOException {

        String stringText = getRowsFromFileToString(path).toString();
        LinkedList<String> result = new LinkedList<>();
        String[] array = stringText.split("[^a-zA-Z]+");
        String[] ch = {"E", "e", "Y", "y", "U", "u", "I", "i", "O", "o", "A", "a"};
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < ch.length; i++) {
                if (array[j].startsWith(ch[i])) {
                    result.add(array[j]);
                }
            }
        }
        return result;
    }

    public static LinkedList<String> getWordsLastFirstEquals(String path) throws IOException {

        String stringText = getRowsFromFileToString(path).toString();
        LinkedList<String> result = new LinkedList<>();
        String[] array = stringText.split("[^a-zA-Z]+");
        for (int i = 0; i < array.length - 1; i++) {
            String firstSimbol = String.valueOf(array[i + 1].charAt(0));
            if (array[i].endsWith(firstSimbol)) {
                result.add(array[i]);
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

    public static StringBuilder getListWithMaxCombination(String path) throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader(path));
        String res;
        StringBuilder result = new StringBuilder();
        while ((res = fileReader.readLine()) != null) {
            String[] nString = res.split("[^0-9]+");

            int[] tempArray = new int[nString.length];
            List<Integer> tempMax = new LinkedList<>();
            List<Integer> resultMax = new LinkedList<>();

            for (int i = 0; i < nString.length; i++) {
                tempArray[i] = Integer.parseInt(String.valueOf(nString[i]));
            }
            for (int i = 0; i < tempArray.length; i++) {
                if (i == tempArray.length - 1) {
                    if (tempArray[i] > tempArray[i - 1]) {
                        tempMax.add(tempArray[i]);
                    }
                    if (tempMax.size() > resultMax.size()) {
                        resultMax = new LinkedList<>(tempMax);
                    }
                } else if (tempArray[i] < tempArray[i + 1]) {
                    tempMax.add(tempArray[i]);
                } else {
                    tempMax.add(tempArray[i]);
                    if (tempMax.size() > resultMax.size()) {
                        resultMax = new LinkedList<>(tempMax);
                    }
                    tempMax.clear();
                }
            }
            result.append(resultMax.toString() + ",");
        }
        fileReader.close();
        return result;
    }


}
