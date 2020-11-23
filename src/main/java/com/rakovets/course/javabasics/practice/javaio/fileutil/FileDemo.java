package com.rakovets.course.javabasics.practice.javaio.fileutil;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        String path = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\Hello.txt";
        String path1 = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\text2.txt";
        String path2 = "C:\\home\\zmachinsky\\course-java-basics-fork\\src\\spec6.txt";

          LinkedList<String> stringB = FileAnalyzeUtil.getRowsFromFileToString(path);
          System.out.print(stringB);



        String inputString = "1 23 1 3 12 4 22 2 555 565 666 777";

        String[] values = inputString.split("[^0-9]+");

        int[] tempArray = new int[values.length];
        List<Integer> tempMax = new LinkedList<>();
        List<Integer> resultMax = new LinkedList<>();

        for (int i = 0; i < values.length; i++) {
            tempArray[i] = Integer.parseInt(String.valueOf(values[i]));
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

     //   System.out.println(resultMax.toString());
    }
}













