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
import java.util.ArrayList;


public class FileAnalyzeUtil {

    public static ArrayList<String> getStrings(String pathFile) {
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
                return null;
            }
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}
