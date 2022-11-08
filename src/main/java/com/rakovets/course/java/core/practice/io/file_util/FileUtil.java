package com.rakovets.course.java.core.practice.io.file_util;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtil {
    public static final Logger logger = Logger.getLogger(FileUtil.class.getName());

    /**
     * Реализовать метод, который принимает пути к двум файлам.
     * Метод переписывает содержимое одного файла в другой файл, но только в ВЕРХНЕМ РЕГИСТРЕ.
     */
    public void rewriteContents(String text, String text2) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(text));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(text2))) {
            String newText;
            while ((newText = bufferedReader.readLine()) != null) {
                bufferedWriter.write(newText.toUpperCase(Locale.ROOT));
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
        }
    }

    /**
     * Реализовать метод, который принимает путь к файлу.
     * Метод возвращает список строк этого файла.
     */
    public List<String> getListStringFromFile(String way) {
        List<String> list = new LinkedList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(way));
            String newText;
            while ((newText = bufferedReader.readLine()) != null) {
                list.add(newText);
            }
        } catch (IOException e) {
            logger.log(Level.WARNING, e.getMessage());
        }
        return list;
    }

    /**
     * Реализовать метод, который принимает путь к файлу.
     * Метод возвращает список слов начинающихся с гласной буквы.
     */
    public List<String> getListStringVowel(String way) {
        List<String> list = new ArrayList<>();
        for (String text : getListStringFromFile(way)) {
            Arrays.stream(text.split(" "))
                    .filter(i -> i.substring(0, 1)
                            .matches("[aeiouyAEIOUY]"))
                    .forEach(list::add);
        }
        return list;
    }

    /**
     * Реализовать метод, который принимает путь к файлу.
     * Метод возвращает список слов,
     * для которых последняя буква совпадает с первой буквой следующего за ним слова.
     */
    public List<String> getListWordWithSameLetters(String way) {
        List<String> list = new ArrayList<>();
        for (String text : getListStringFromFile(way)) {
            String[] nj = text.split(" ");
            for (int i = 0; i < nj.length - 1; i++){
                String[] nm = nj[i].split("");
                for (int j = 0; j < nm.length - 1; j++){
                    String temp = nm[nm.length - 1];
                    if (nj[i + 1].startsWith(temp)){
                        list.add(nj[i]);
                        break;
                    }
                }
            }
        }
        return list;
    }
}

