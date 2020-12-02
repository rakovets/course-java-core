package com.rakovets.course.javabasics.practice.javaio;
//=== Specification of task 2
//
//        Реализовать метод, который принимает путь к файлу и возвращает список строк этого файла.
//
//        === Specification of task 3
//
//        Реализовать метод, который принимает путь к файлу и возвращает список слов начинающихся с гласной буквы.
//
//        === Specification of task 4
//
//        Реализовать метод, который принимает путь к файлу и возвращает список слов, для которых последняя буква совпадает с первой буквой следующего за ним слова.
//
//
//        === Specification of task 5
//
//        Реализовать метод, который принимает путь к файлу и возвращает список наибольшей комбинации цифр для каждой строки, которые идут в порядке возрастания.
//
//        Например:
//
//        Input:
//
//        ----
//        1 2 1 2 3
//        67 68 69 23
//        ----
//
//        Output:
//        ----
//        "1 2 3", "67 68 69"
//        ----
//
//        === Specification of task 6
//
//        Реализовать метод, который принимает путь к файлу и возвращает частоту повторяемости всех букв в тексте, игнорируя регистр.
//
//        === Specification of task 7
//
//        Реализовать метод, который принимает путь к файлу и возвращает частоту повторяемости всех слов в тексте в порядке возрастания частоты повторяемости.
//
//        === Specification of task 8
//
//        Реализовать метод, который принимает путь к файлу с целыми числами и сортирующий содержимое файла по возрастанию (с перезаписью содержимого файла).
//
//        === Specification of task 9
//
//        Реализовать метод, который принимает путь к файлу, где содержится фамилия студентов и их оценки (в качестве разделитетеля используется `,`) и возвращает успеваемость студентов.
//
//        === Specification of task 10
//
//        Реализовать метод, который принимает путь к файлу с java кодом, и 2 модификатора доступа в виде строки и заменяет все модификаторы доступа `X` в объявлении атрибутов и методов класса на `Y`.



import java.io.*;
import java.nio.CharBuffer;
import java.util.*;


public class FileAnalyzeUtil {

    public static ArrayList<String> getStringsLine(String pathFile) {
        ArrayList<String> file = new ArrayList<>();
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    file.add(line);
                }
                return file;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return null;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static ArrayList<String> getStringsVowel(String pathFile) {
        ArrayList<String> file = new ArrayList<>();
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.matches("^[AEIOUYaeiouy].*"))
                        file.add(line);
                }
                return file;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return null;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static ArrayList<String> getStringsTrace(String pathFile) {
        ArrayList<String> file = new ArrayList<>();
        String string = "";
        String lastLatter = "";
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            try {
                while ((string = bufferedReader.readLine()) != null) {
                    if (!lastLatter.equals("")) {
                        if (lastLatter.charAt(lastLatter.length() - 1) == string.charAt(0)) {
                            file.add(lastLatter);
                        }
                    }
                    lastLatter = string;
                }
                return file;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return null;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static ArrayList<String> getStringsNum(String pathFile) {
        ArrayList<String> file = new ArrayList<>();
        String string = "";
        String lastLatter = "";
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            try {
                while ((string = bufferedReader.readLine()) != null) {
                    file.add(num(string));
                }
                return file;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return null;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static String num(String string) {
        List<String> lists = Arrays.asList(string.split(" +"));
        List<Integer> numToList = new ArrayList<>();
        for (String str : lists)
            numToList.add(Integer.parseInt(str));
        List<List<Integer>> listToNum = new ArrayList<>();
        int fromIndex = 0;
        if (lists.size() > 1) {
            for (int i = 1; i < numToList.size(); i++) {
                if (numToList.get(i - 1) >= numToList.get(i)) {
                    listToNum.add(numToList.subList(fromIndex, i));
                    fromIndex = i;
                }
            }
            listToNum.add(numToList.subList(fromIndex, numToList.size()));
        } else return lists.get(0);
        int size = listToNum.get(0).size();
        int m = size;
        int mesto = 0;
        for (int i = 1; i < listToNum.size(); i++) {
            size = listToNum.get(i).size();
            if (m < size) {
                m = size;
                mesto = i;
            }
        }
        String resultat = "";
        for (Integer num : listToNum.get(mesto)) {
            resultat += num + " ";
        }
        return resultat.trim();
    }

    public static List<String> getRepeatLetters(String path) {
        String strings = "";
        List<String> list = new ArrayList<>();
        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((strings = reader.readLine()) != null) {
                if (!strings.equals("")) {
                    text += strings + " ";
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Map<Character, Integer> charMap = new TreeMap<>();
        char ch = ' ';
        text = text.replace(" ", "");
        text = text.toLowerCase();
        while (!text.isEmpty()) {
            ch = text.charAt(0);
            text = text.substring(1);
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else charMap.put(ch, 1);
        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            list.add(entry.getKey() + "-" + entry.getValue());
        }
        return list;
    }

    public static List<String> getRepeatWord(String path) {
        String strings = "";
        List<String> list = new ArrayList<>();
        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((strings = reader.readLine()) != null) {
                if (!strings.equals("")) {
                    text += strings + " ";
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Map<String, Integer> stringMap = new TreeMap<>();
        String[] wordsList = text.split(" +");
        for (String word : wordsList) {
            if (stringMap.containsKey(word)) {
                stringMap.put(word, stringMap.get(word) + 1);
            } else stringMap.put(word, 1);
        }
        int i = 0;
        for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            wordsList[i++] = entry.getValue() + "-" + entry.getKey();
            String[] result = Arrays.copyOf(wordsList, i);
            Arrays.sort(result);
            list = Arrays.asList(result);
        }
        return list;
    }

    public static List<String> getSortNum(String path) {
        String strings = "";
        List<String> list = new ArrayList<>();
        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((strings = reader.readLine()) != null) {
                if (!strings.equals("")) {
                    text += strings + " ";
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String[] stringNumbers = text.split(" +");
        int[] nums = new int[stringNumbers.length];
        for (int j = 0; j < stringNumbers.length; j++) {
            if (!stringNumbers[j].equals("")) {
                nums[j] = Integer.parseInt(stringNumbers[j]);
            }
        }
        Arrays.sort(nums);
        try (FileWriter writer = new FileWriter(path)) {
            for (int j = 0; j < stringNumbers.length; j++) {
                stringNumbers[j] = "" + nums[j];
                writer.write(stringNumbers[j] + System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        list.addAll(Arrays.asList(stringNumbers));
        return list;
    }
}


