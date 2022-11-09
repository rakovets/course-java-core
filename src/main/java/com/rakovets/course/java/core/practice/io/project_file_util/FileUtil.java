package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileUtil {
    public void fileTextToUpperCase(String fileNameFirst, String fileNameSecond) {
        String fileNameFirstUni = fileNameFirst.replaceAll("//", File.separator);
        String fileNameSecondUni = fileNameSecond.replaceAll("//", File.separator);
        try (BufferedReader br = new BufferedReader(new FileReader(fileNameFirstUni));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameSecondUni))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                bw.write(s.toUpperCase());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<String> getStringListFromFile(String pathToFile) {
        String pathToFileUni = pathToFile.replaceAll("//", File.separator);
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFileUni))) {
            String s;
            while ((s = br.readLine()) != null) {
                stringList.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return stringList;
    }

    public List<String> getStringListOfWordsStartingWithVowelsFromFile(String pathToFile) {
        String pathToFileUni = pathToFile.replaceAll("//", File.separator);
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFileUni))) {
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
                .filter(x -> (!x.isBlank()))
                .filter(x ->
                        x.charAt(0) == 'a' ||
                        x.charAt(0) == 'e' ||
                        x.charAt(0) == 'i' ||
                        x.charAt(0) == 'o' ||
                        x.charAt(0) == 'u' ||
                        x.charAt(0) == 'y' ||
                        x.charAt(0) == 'A' ||
                        x.charAt(0) == 'E' ||
                        x.charAt(0) == 'O' ||
                        x.charAt(0) == 'U' ||
                        x.charAt(0) == 'Y')
                .collect(Collectors.toList());
        return stringList2;
    }

    public List<String> getStringListOfWordsEndsWithLetterNextWordStatsFromFile(String pathToFile) {
        String pathToFileUni = pathToFile.replaceAll("//", File.separator);
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFileUni))) {
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
                .filter(x -> (!x.isBlank()))
                .collect(Collectors.toList());
        String[] array = new String[stringList2.size()];
        stringList2.toArray(array);
        List<String> stringList3 = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].endsWith(String.valueOf(array[i + 1].charAt(0)))) {
                stringList3.add(array[i]);
            }
        }
        return stringList3;
    }

    public List<String> getOnlyIncreasingValuesfromFile(String pathToFile) {
        String pathToFileUni = pathToFile.replaceAll("//", File.separator);
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFileUni))) {
            String s;
            while ((s = br.readLine()) != null) {
                stringList.add(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        List<String> stringList2 = stringList.stream()
                .map(x -> x.replaceAll("\\p{Punct}", ""))
                .map(x -> x.toUpperCase())
                .map(x -> x.replaceAll("[A-Z]", ""))
                .map(x -> x.replaceAll("[А-Я]", ""))
                .map(x -> x.replaceAll("   ", " "))
                .map(x -> x.replaceAll("  ", " "))
                .filter(x -> (!x.isBlank()))
                .collect(Collectors.toList());
        List<String> stringList3 = new ArrayList<>();
        for (String s : stringList2) {
            String[] arrayString = s.split(" ");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(arrayString[0]);
            int max = Integer.parseInt(arrayString[0]);
            for (int i = 1; i < arrayString.length; i++) {
                if (Integer.parseInt(arrayString[i]) > max) {
                    max = Integer.parseInt(arrayString[i]);
                    stringBuffer.append(" ");
                    stringBuffer.append(arrayString[i]);
                }
            }
            String stringToList = stringBuffer.toString();
            stringList3.add(stringToList);
        }
        return stringList3;
    }

    public Map<Character, Integer> getUniqueLettersFromFileAndCountThem(String pathToFile) {
        String pathToFileUni = pathToFile.replaceAll("//", File.separator);
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFileUni))) {
            String s;
            while ((s = br.readLine()) != null) {
                stringList.add(s.toLowerCase());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        String str = stringList.toString();
        String str2 = str.replaceAll("\\p{Punct}", "");
        String str3 = str2.replaceAll(" ", "");
        Map<Character, Integer> uniqueLetters = new HashMap<>();
        for (int i = 0; i < str3.length() - 1; i++) {
            if (str3.charAt(i) < '0' || str3.charAt(i) > '9' ) {
                Integer ii = 1;
                Integer jj = uniqueLetters.put(str3.charAt(i), ii);
                if (jj != null) {
                    jj++;
                    uniqueLetters.put(str3.charAt(i), jj);
                }
            }
        }
        return uniqueLetters;
    }

    public Map getFrequencyOfUniqueWordsFromFile(String pathToFile) {
        String pathToFileUni = pathToFile.replaceAll("//", File.separator);
        List<String> stringList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFileUni))) {
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
        Map<String, Integer> unsortedUniqueWords = new HashMap();
        for (String s : stringList2) {
            Integer i = 1;
            Integer j = unsortedUniqueWords.put(s, i);
            if (j != null) {
                j++;
                unsortedUniqueWords.put(s, j);
            }
        }
        List<Map.Entry> list = new LinkedList<>(unsortedUniqueWords.entrySet());
        list.sort((a, b) -> (int) a.getValue() - (int) b.getValue());//(new MyComparatorTask07());
        Map sortedUniqueWords = new LinkedHashMap();
        for (Map.Entry entry : list) {
            sortedUniqueWords.put(entry.getKey(), entry.getValue());
        }
        return sortedUniqueWords;
    }

    public int[] getReversedIntArrayFromFile(String pathToFile) throws IOException {
        String pathToFileUni = pathToFile.replaceAll("//", File.separator);
        int arraySize = new FileInputStream(pathToFileUni).available() / 4;
        int[] outArray = new int[arraySize];
        try (DataInputStream dos = new DataInputStream(new FileInputStream(pathToFileUni))) {
            for (int i = 0; i < arraySize; i++) {
                outArray[i] = dos.readInt();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        int[] finalArray = IntStream.of(outArray)
                .sorted()
                .toArray();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(pathToFileUni))) {
            for (int i = 0; i < arraySize; i++) {
                dos.writeInt(finalArray[i]);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return finalArray;
    }
}
