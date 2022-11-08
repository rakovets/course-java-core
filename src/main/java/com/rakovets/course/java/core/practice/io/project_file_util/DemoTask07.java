package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class DemoTask07 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(DemoTask07.class.getName());
        String pathToFile = "C:\\MyDir\\task07.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathToFile))) {
            String text1 = "Any yo any.    text 1.\n";
            String text2 = "ooy ide? ust text 2.\n";
            String text3 = "gy ako  any op text 3.\n";
            bw.write(text1);
            bw.write(text2);
            bw.write(text3);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String s;
            while ((s = br.readLine()) != null) {
                stringList.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        List<String> stringList2 = stringList.stream()
                .flatMap(x ->
                        Arrays.stream(x.split(" "))
                )
                .map(x -> x.replaceAll("\\p{Punct}", ""))
                .map(x -> x.replaceAll("\\d",""))
                .filter(x -> (!x.isBlank()))
                .collect(Collectors.toList());
        logger.info(stringList2.toString());
        Map<String, Integer> unsortedUniqueWords = new HashMap();
        for (String s : stringList2) {
            Integer i = 1;
            Integer j = unsortedUniqueWords.put(s, i);
            if (j != null) {
                j++;
                unsortedUniqueWords.put(s, j);
            }
        }
        logger.info(unsortedUniqueWords.entrySet().toString());
        List<Map.Entry> list = new LinkedList<>(unsortedUniqueWords.entrySet());
        Collections.sort(list, new MyComparatorTask07());
        Map sortedUniqueWords = new LinkedHashMap();
        for (Map.Entry entry : list) {
            sortedUniqueWords.put(entry.getKey(), entry.getValue());
        }
        logger.info(sortedUniqueWords.toString());
    }
}
