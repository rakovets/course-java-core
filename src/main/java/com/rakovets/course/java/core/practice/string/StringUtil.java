package com.rakovets.course.java.core.practice.string;

public class StringUtil {

    // task 1. Метод возвращает строку, которая является результатом склеивания двух строк.
    // В случае строки равной null возвращает null.
        static public String getStringConcat (String firstString, String secondString) {
            if (firstString != null && secondString != null) {
                return firstString.concat(secondString);
            }
            return null;
        }

    // task 2. Метод возвращает индекс символа x (x – символ вводимый пользователем) в строке.
    // Если такого символа нет, то возвращает значение -1. В случае не инициализированной строки или символа возвращает .
        static public int getIndexOf (String example, char x) {
            if (example != null && x != 0) {
                return example.indexOf(x);
            }
            return -1;
        }

    // task 3. Метод возвращает булинное значение равенства строк, учитывая регистр. В случае строки равной null возвращает false.
        static public boolean isStringsEquals (String firstString, String secondString) {
            if (firstString != null && secondString != null) {
                return firstString.equals(secondString);
            }
            return false;
        }

    // task 4. Метод возвращает значение строки прописными буквами без пробелов в начале и конце значения.
    // В случае строки равной null возвращает null.
    static public String getTrimmedUpperCase (String example) {
        if (example != null) {
            return example.trim().toUpperCase();
        }
        return null;
    }

    // task 5. Метод возвращает подстроку, начиная с 10 символа (index 9) длинной не более 23 символов.
    // Если строка меньше десяти символов возвращает пустую строку. В случае строки равной null возвращает null.
    static public String getSubstringFromTen (String example) {
        if (example != null) {
            if (example.length() < 10) {
                return "";
            } else if (example.length() <= 33) {
                return example.substring(9);
            } else {
                return example.substring(9, 32);
            }
        }
        return null;
    }



}
