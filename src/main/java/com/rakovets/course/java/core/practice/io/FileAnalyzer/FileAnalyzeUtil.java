package com.rakovets.course.java.core.practice.io.FileAnalyzer;

import java.io.*;
import java.util.*;

public class FileAnalyzeUtil {

    public static List<String> myList(String filePath) {
        List<String> myList = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(filePath))) {
            String str;
            while ((str = in.readLine()) != null) {
                myList.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myList;
    }

    public static List<String> listWordsStartWithVowel(String filePath) {
        List<String> listWordsStartWithVowel = new ArrayList<>();
        StringBuilder words = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(filePath))) {
            int i;
            while ((i = in.read()) != -1) {
                words.append((char) i);
            }
            for (String word : words.toString().split("\\W")) {
                if (word.matches("[aAeEiIoOuUyY](.*)")) {
                    listWordsStartWithVowel.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listWordsStartWithVowel;
    }

    public static List<String> wordsWithEqualFirstAndLastLetter(String filePath) {
        List<String> wordsWithEqualFirstAndLastLetter = new ArrayList<>();
        StringBuilder words = new StringBuilder();
        String[] word;
        try (BufferedReader in = new BufferedReader(new FileReader(filePath))) {
            int i;
            while ((i = in.read()) != -1) {
                words.append((char) i);
            }
            while (words.toString().contains("  ")) {
                words = new StringBuilder(new StringBuilder(words.toString().replace("  ", " ")));
            }
            word = words.toString().split("\\W");
            for (int j = 0; j < word.length - 1; j++) {
                if (word[j] != null && word[j + 1] != null)
                    if (word[j].charAt(word[j].length() - 1) == word[j + 1].charAt(0))
                        wordsWithEqualFirstAndLastLetter.add(word[j]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordsWithEqualFirstAndLastLetter;
    }

    public static List<String> listOfLargestNumberCombination(String filePath) {
        List<String> result = new ArrayList<>();
        List<String> numbers = new ArrayList<>();;
        try (BufferedReader in = new BufferedReader(new FileReader(filePath))) {
            String i;
            while ((i = in.readLine()) != null) {
                numbers.add(i);
            }
            FileReader reader = new FileReader(filePath);
            LineNumberReader lineNumberReader = new LineNumberReader(reader);
            String line = lineNumberReader.readLine();
            while (line != null) {
                numbers = Arrays.asList(line.split(" "));
                int[] num = new int[numbers.size()];
                int max = 0;
                for (int j = 0; j < numbers.size(); j++) {
                    num[j] = Integer.parseInt(numbers.get(j));
                    if (num[j] > max) {
                        result.add(numbers.get(j));
                        max = num[j];
                    }
                }
                line = lineNumberReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<String> frequencyOfRepetition(String filePath) {
        String str;
        List<String> list = new ArrayList<>();
        StringBuilder text = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(filePath))) {
            while ((str = in.readLine()) != null) {
                if (!str.equals(""))
                    text.append(str).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<Character, Integer> map = new HashMap<>();
        char ch = ' ';
        text = new StringBuilder(text.toString().replace(" ", ""));
        text = new StringBuilder(text.toString().toLowerCase());
        while (text.length() > 0) {
            ch = text.charAt(0);
            text = new StringBuilder(text.substring(1));
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(entry.getKey() + "-" + entry.getValue());
        }
        return list;
    }

    public static List<String> frequencyOfWordsAscendingOrder(String filePath) {
        String str;
        List<String> list;
        StringBuilder text = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new FileReader(filePath))) {
            while ((str = in.readLine()) != null) {
                if (!str.equals("")) {
                    text.append(str).append(" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Integer> map = new HashMap<>();
        String[] words = text.toString().split(" +");
        for (String word : words) {
            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }
        int i = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            words[i++] = entry.getValue() + "-" + entry.getKey();
        }
        String[] result = Arrays.copyOf(words, i);
        Arrays.sort(result);
        list = Arrays.asList(result);
        return list;
    }

    public static List<Integer> sortInAscendingOrder(String filePath) {
        List<String> numbers;
        String newFilePath = filePath.replace(filePath, filePath + "_");
        List<Integer> list = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(filePath));
            BufferedWriter out = new BufferedWriter(new FileWriter(newFilePath)))  {
            String str;
            while ((str = in.readLine()) != null) {
                numbers = Arrays.asList(str.split("\\W"));
                for (String number : numbers) {
                    list.add(Integer.parseInt(number));
                }
                list.sort(Comparator.comparingInt(o -> o));
                for (int value : list) {
                    out.write(value + " ");
                    out.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static Map<String, Double> studentProgress(String filePath) {
        Map<String, Double> map = new HashMap<>();
        String str, lastname, marks;
        int comma;
        double averageMark;
        int sum = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(filePath))) {
            while ((str = in.readLine()) != null) {
                comma = str.indexOf(',');
                lastname = str.substring(0, comma);
                marks = str.substring(comma + 1);
                List<String> arr = Arrays.asList(marks.split(","));
                int[] arrInt = new int[arr.size()];
                for (int i = 0; i < arrInt.length; i++) {
                    arrInt[i] = Integer.parseInt(arr.get(i));
                }
                for (int value : arrInt) {
                    sum += value;
                }
                averageMark = (double) sum / arrInt.length;
                averageMark = (double) Math.round(averageMark * 10) / 10;
                map.put(lastname, averageMark);
                sum = 0;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static void replaceAccessModifiers(String filePath, String oldModifier, String newModifier) {
        String newFilePath = filePath.replace(filePath, filePath + "_");
        String str;
        String newStr;
        try (BufferedReader in = new BufferedReader(new FileReader(filePath));
            BufferedWriter out = new BufferedWriter(new FileWriter(newFilePath))) {
            while ((str = in.readLine()) != null) {
                newStr = str.replace(oldModifier, newModifier);
                out.write(newStr + "\n");
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
