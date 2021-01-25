package com.rakovets.course.java.core;

import java.util.Arrays;

public class StringUtil {
    //Task1
    //Используя методы класса String вывести строку, которая является результатом склеивания
    //двух строк.
    public static String getConcat(String one, String two) {
        if (one == null || two == null) {
            return null;
        }
        return one.concat(two);
    }

    //Task2
    //Найти индекс символа x (x – символ вводимый пользователем) в строке. Если такого
    //символа нет, то -1.
    public static int getIndex(String str, char x) {
        if (str == null) {
            return -1;
        }
        return str.indexOf(x);
    }

    //Task3
    //Определить, являются ли две строки одинаковыми учитывая регистр.
    public static boolean getEquals(String one, String two) {
        if (one == null && two == null) {
            return false;
        }
        return one.equals(two);
    }

    //Task4
    //В строке удалить пробелы в начале и конце. Сделать что бы вся строка состояла из
    //прописных букв.
    public static String getTrim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim().toLowerCase();
    }

    //Task5
    //Из строки извлечь подстроку начиная с n-го символа и до m-го символа.
    public static String getSubString(String str, int start, int finish) {
        if (str == null || str.length() < start || str.length() < finish) {
            return null;
        } else {
            return str.substring(start - 1, finish);
        }
    }

    //Task6
    //Заменить все грустные emoji :( в строке на весёлые :).
    public static String getReplace(String str) {
        if (str == null) {
            return null;
        } else {
            return str.replace(":(", ":)");
        }
    }

    //Task7
    //Написать метод принимающий 2 параметра text и word, а возвращает:
    //• true, если строка начинается и заканчивается этим словом
    //• false во всех остальных
    public static boolean getTrueFalse(String string, String word) {
        if (string == null || word == null) {
            return false;
        } else {
            string = string.toLowerCase();
            return string.startsWith(word.toLowerCase()) && string.endsWith(word.toLowerCase());
        }
    }

    //Task8
    //Определить количество английских гласных букв в предложении.
    public static int getConsonants(String str) {
        if (str == null) {
            return 0;
        } else {
            int counter = 0;
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y') {
                    counter++;
                }
            }
            return counter;
        }
    }

    //Task9
    //Подсчитать общее количество знаков препинания (точек, запятых, вопросительных и
    //восклицательных знаков) в строке.
    public static int getPunctuationMarks(String str) {
        if (str == null) {
            return 0;
        } else {
            int counterPunctuationMarks = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '!' || str.charAt(i) == '?') {
                    counterPunctuationMarks++;
                }
            }
            return counterPunctuationMarks;
        }
    }

    //Task10
    //Проверить, является ли введённая строка палиндромом.
    public static boolean getPalindrome(String str) {
        if (str == null) {
            return false;
        } else {
            str = str.replaceAll(" ", "").toLowerCase();
            String rts = new StringBuilder(str).reverse().toString();
            return str.equals(rts);
        }
    }

    //Task11
    //Разбить строку на равные части по n символов и сохранить отдельные части в массив.
    public static String[] getParseString(String str, int n) {
        if (str == null || str.length() % n != 0 || n < 0) {
            return null;
        } else {
            String[] result = new String[str.length() / n];
            int k = 0;
            for (int i = 0; i < str.length(); i = i + n) {
                result[k] = str.substring(i, i + n);
                k++;
            }
            return result;
        }
    }

    //Task12
    //Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими
    //пробелами.
    public static int getSplit(String str) {
        if (str == null) {
            return 0;
        } else {
            str = str.trim();
            int sum = str.split(" +").length;
            return sum;
        }
    }

    //Task13
    //Дано фамилия и имя как одна строка. Вернуть инициалы согласно паттерну FL, например:
    //DmitRY RakOVets → DR. Учесть, что входные параметры могут быть в любом регистре, а
    //результирующая строка должна быть в верхнем.
    public static String getFullName(String nameSurnamePatronymic) {
        if (nameSurnamePatronymic == null) {
            return null;
        } else {
            String[] arr = nameSurnamePatronymic.split(" ");
            String allName = arr[0].charAt(0) + "." + arr[1].charAt(0) + "." + arr[2].charAt(0) + ".";
            return allName.toUpperCase();
        }
    }

    //Task14
    //Вернуть строку, которая содержит все имеющиеся в тексте цифры.
    public static String getNumbers(String text) {
        if (text == null) {
            return null;
        } else {
            return text.replaceAll("[^0-9]", "");
        }
    }

    //Task15
    //Вернуть только те символы двух слов, которые есть только в одном из них, в том числе
    //повторяющиеся. Например, если заданные слова information и motivation, то ответом должно
    //быть: nfrtv.
    public static String getFind(String one, String two) {
        if (one == null || two == null) {
            return null;
        } else {
            String str = "";
            for (int i = 0; i < one.length(); i++) {
                if (!two.contains(one.substring(i, i + 1))) {
                    str += one.substring(i, i + 1) + " ";
                }
            }
            for (int i = 0; i < two.length(); i++) {
                if (!one.contains(two.substring(i, i + 1))) {
                    str += two.substring(i, i + 1) + " ";
                }
            }
            return str;
        }
    }

    //Task16
    //Заданы два массива строк. Определить, является ли содержимое этих массивов
    //идентичным. Порядок расположения элементов значения не имеет.
    public static boolean getArrayString(String[] one, String[] two) {
        Arrays.sort(one);
        Arrays.sort(two);
        return Arrays.equals(one, two);
    }

    //Task17
    //Написать два цикла, выполняющих многократное сложение строк, один с помощью
    //оператора сложения и String, второй с помощью StringBuilder и метода append. Сравнить
    //скорость их выполнения.
    //Возвращает 0, если равны, 1, если первый быстрее, -1, если первый медленее
    public static int compareStringMethods(String str) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 30; i++) {
            result += str;
        }
        long endTime = System.currentTimeMillis();
        long time1 = startTime - endTime;

        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            strB.append(str);
        }
        long time2 = endTime - System.currentTimeMillis();
        if (time1 > time2) {
            return 1;
        }
        if (time1 < time2) {
            return -1;
        }
        return 0;
    }

    //Task18
    //Заменить несколько последовательных одинаковых символов в строке одним. Например:
    //aaabbcdeef → abcdef
    public static String getCopy(String str) {
        if (str == null) {
            return null;
        } else {
            return str.replaceAll("(.)\\1+", "$1");
        }
    }

    //Task19
    //Преобразовать строку, содержащую римскую запись числа, в арабскую запись числа.
    //Границы чисел: от 1 до 3999.
    //Предусмотреть случай, когда меньший символ идёт перед большим, например: CM = 900.
    public static int getRomeNumbers(String str) {
        int number = 0;
        int currentNumber = 0;
        int lastNumber = 0;
        str = str.toUpperCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            switch (str.charAt(i)) {
                case 'M':
                    currentNumber = 1000;
                    break;
                case 'D':
                    currentNumber = 500;
                    break;
                case 'C':
                    currentNumber = 100;
                    break;
                case 'L':
                    currentNumber = 50;
                    break;
                case 'X':
                    currentNumber = 10;
                    break;
                case 'V':
                    currentNumber = 5;
                    break;
                case 'I':
                    currentNumber = 1;
                    break;
            }
            if (lastNumber > currentNumber) {
                number -= currentNumber;
            } else {
                number += currentNumber;
            }
            lastNumber = currentNumber;
        }
        return number;
    }

}
