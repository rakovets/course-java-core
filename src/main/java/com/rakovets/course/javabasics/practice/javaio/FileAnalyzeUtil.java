package com.rakovets.course.javabasics.practice.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileAnalyzeUtil {
    public static List<String> getList(String path, String condition) {
        String string = "";
        List<String> list = new ArrayList<>();
        String lastWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((string = reader.readLine()) != null) {
                switch (condition) {
                    case "all":
                        list.add(string);
                        break;
                    case "firstVowel":
                        if (string.matches("^[aeiouyAEIOUY].*"))
                            list.add(string);
                        break;
                    case "lastChar":
                        if (!lastWord.equals("")) {
                            if (lastWord.charAt(lastWord.length() - 1) == string.charAt(0)) {
                                list.add(lastWord);
                            }
                        }
                        lastWord = string;
                        break;
                    case "numbers":
                        list.add(numbers(string));
                        break;
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }


    public static String numbers(String string) {
        List<String> list = Arrays.asList(string.split(" +"));
        List<Integer> numbersList = new ArrayList<>();
        for (String str : list)
            numbersList.add(Integer.parseInt(str));
        List<List<Integer>> listOfNumbersList = new ArrayList<>();
        int fromIndex = 0;
        if (list.size() > 1) {
            for (int i = 1; i < numbersList.size(); i++) {
                if (numbersList.get(i - 1) >= numbersList.get(i)) {
                    listOfNumbersList.add(numbersList.subList(fromIndex, i));
                    fromIndex = i;
                }
            }
            listOfNumbersList.add(numbersList.subList(fromIndex, numbersList.size()));
        } else return list.get(0);
        int size = listOfNumbersList.get(0).size();
        int max = size;
        int index = 0;
        for (int i = 1; i < listOfNumbersList.size(); i++) {
            size = listOfNumbersList.get(i).size();
            if (max < size) {
                max = size;
                index = i;
            }
        }
        String result = "";
        for (Integer num : listOfNumbersList.get(index)) {
            result += num + " ";
        }
        return result.trim();
    }

}
