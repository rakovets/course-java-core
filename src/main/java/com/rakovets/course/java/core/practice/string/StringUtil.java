package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    // task 1. Метод возвращает строку, которая является результатом склеивания двух строк.
    // В случае строки равной null возвращает null.
    public static String getStringConcat (String firstString, String secondString) {
        if (firstString != null && secondString != null) {
            return firstString.concat(secondString);
        }
        return null;
    }

    // task 2. Метод возвращает индекс символа x (x – символ вводимый пользователем) в строке.
    // Если такого символа нет, то возвращает значение -1. В случае не инициализированной строки или символа возвращает -1.
    public static int getIndexOf (String example, char x) {
        if (example != null && x != 0) {
            return example.indexOf(x);
        }
        return -1;
    }

    // task 3. Метод возвращает булинное значение равенства строк, учитывая регистр.
    // В случае строки равной null возвращает false.
    public static boolean isStringsEquals (String firstString, String secondString) {
        if (firstString != null && secondString != null) {
            return firstString.equals(secondString);
        }
        return false;
    }

    // task 4. Метод возвращает значение строки прописными буквами без пробелов в начале и конце значения.
    // В случае строки равной null возвращает null.
    public static String getTrimmedUpperCase (String example) {
        if (example != null) {
            return example.trim().toUpperCase();
        }
        return null;
    }

    // task 5. Метод возвращает подстроку, начиная с 10 символа (index 9) длинной не более 23 символов.
    // Если строка меньше десяти символов возвращает пустую строку. В случае строки равной null возвращает null.
    public static String getSubstringFromTen (String example) {
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

    // task 6. Метод заменяет в строке все сочетания символов ":(" на ":)".
    // В случае строки равной null возвращает null.
    public static String replaceSadEmoji (String sad) {
        if (sad != null) {
            return sad.replace(":(", ":)");
            }
        return null;
    }

    // task 7. Метод возвращает булинное значение true, если параметр строки начинает и заканчивается с параметра слова.
    // В случае строки или слова равных null возвращает false. Метод учитывает регистр параметров.
    public static boolean doesStringStartsAndEndsWithWord (String example, String word) {
        if (example != null && word != null) {
            return (example.startsWith(word) && example.endsWith(word));
        }
        return false;
    }

    // task 8. Метод возвращает количество гласных букв в заданной строке (для английского языка).
    // В случае строки равной null возвращает -1.
    public static int getNumberOfVowels (String example) {
        if (example != null) {
            String exampleInProgress = example.toLowerCase(Locale.ROOT);
            char[] exampleInProgressArray = exampleInProgress.toCharArray();
            int numberOfVowels = 0;

            for (char c : exampleInProgressArray) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                    numberOfVowels += 1;
                }
            }
            return numberOfVowels;
        }
        return -1;
    }

    // task 9. Метод возвращает общее количество знаков препинания (точек, запятых, вопросительных и восклицательных знаков).
    // В случае строки равной null возвращает -1.
    public static int getNumberOfPunctuationMarks (String example) {
        if (example != null) {
            char[] exampleArray = example.toCharArray();
            int numberOfPunctuationMarks = 0;

            for (char c : exampleArray) {
                if (c == '.' || c == ',' || c == '!'|| c == '?') {
                    numberOfPunctuationMarks += 1;
                }
            }
            return numberOfPunctuationMarks;
        }
        return -1;
    }

    //task 10. Метод возвращает булинное значение того, является ли введённая строка палиндромом.
    // В случае строки равной null возвращает false.
    public static boolean isPalindrome (String example) {
        if (example != null) {

            Pattern punctuationDeleting = Pattern.compile("\\s*(\\s|,|\\?|!|:|;|-|\\.)\\s*");
            Matcher matcher = punctuationDeleting.matcher(example);
            String examplePure = matcher.replaceAll("");

            StringBuilder palindromeCheckingBuilder = new StringBuilder(examplePure);
            palindromeCheckingBuilder = palindromeCheckingBuilder.reverse();
            String palindromeChecking = palindromeCheckingBuilder.toString();

            return examplePure.equalsIgnoreCase(palindromeChecking);
        }
        return false;
    }

    // task 11. Метод разбивает строку на равные части по n символов возвращает массив из этих частей.
    // В случае строки равной null возвращает null.
    public static String[] splitByIndex (String example, int n) {
        if (example != null && n > 0) {
            StringBuilder exampleWithDivider = new StringBuilder(example);

                for (int x = n; x < exampleWithDivider.length(); ) {
                    exampleWithDivider.insert(x, "%@#");
                    x += n + 3;
            }
            return exampleWithDivider.toString().split("%@#");
        }
        return null;
    }

    //task 12. Метод возвращает количество слов в тексте.
    // В случае строки равной null возвращает -1.
    public static int getNumberOfWords (String example) {
        if (example != null) {
            Pattern punctuationDeleting = Pattern.compile("[,.!?*\\-:+]");
            Matcher matcher = punctuationDeleting.matcher(example);
            String examplePure = matcher.replaceAll("");

            String[] exampleArray = examplePure.trim().split("\\s+");
            return exampleArray.length;
        }
        return -1;
    }

    // task 13. Метод возвращает инициалы в формате Ф.И.О при заданной строке с именем, фамилией и отчеством.
    // В случае строки равной null возвращает null.
    public static String getInitials (String example) {
        if (example != null) {
            String[] exampleArray = example.trim().toUpperCase().split("\\s+");
            char name = exampleArray[0].charAt(0);
            char surname = exampleArray[1].charAt(0);
            char patronymic = exampleArray[2].charAt(0);
            return surname + "." + name + "." + patronymic;
        }
        return null;
    }

    // task 14. Метод возвращает строку, которая содержит все имеющиеся в тексте цифры.
    // В случае строки равной null возвращает null.
    public static String getOnlyDigits (String example) {
        if (example != null) {
            return example.replaceAll("\\D", "");
        }
        return null;
    }

    // task 15. Метод принимает два слова и возвращает строку, из букв, которые уникальны для каждого.
    // Если уникальные буквы повторяются в одном слове - возвращает все эти повторения.
    // В случае строк равных null возвращает null.
    public static String getUniqueLetters (String firstWord, String secondWord) {
        if (firstWord != null && secondWord != null) {
            String firstWordPure = firstWord.trim().toLowerCase(Locale.ROOT);
            String secondWordPure = secondWord.trim().toLowerCase(Locale.ROOT);
            StringBuilder firstWordBuilder = new StringBuilder(firstWordPure);
            StringBuilder secondWordBuilder = new StringBuilder(secondWordPure);
            boolean ifMatches = false;

            for (int x = 0; x < firstWordPure.length(); x++) {
                for (int y = 0; y < secondWordPure.length(); y++) {
                    if (firstWordPure.charAt(x) == secondWordPure.charAt(y)) {
                        secondWordBuilder.replace(y, y + 1, " ");
                        ifMatches = true;
                    }
                }
                if (ifMatches) {
                    firstWordBuilder.replace(x, x + 1, " ");
                }
                ifMatches = false;
            }
            return firstWordBuilder.append(secondWordBuilder).toString().replaceAll("\\s", "");
        }
        return null;
    }

    // task 16. Метод возвращает булинное значение идентичности двух массивов строк
    // вне зависимости от порядка расположения элементов. В случае массивов равных null возвращает false.
    public static boolean isArraysEqual (String[] firstArray, String[] secondArray) {
        if (firstArray != null && secondArray != null) {
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            return Arrays.equals(firstArray, secondArray);
        }
        return false;
    }

    // task 17. Метод возвращает время выполнения двух циклов, выполняющих y-кратное сложение строк.
    // Первый цикл использует оператор сложения и String, второй - StringBuilder и метод append.
    public static String getMethodsSpeedComparison (int y) {
        String testString = "String is immutable";
        String concatenation = testString;
        StringBuilder testBuilder = new StringBuilder(testString);
        long startTime = System.nanoTime();

        for (int x = 0; x < y; x++) {
            concatenation += testString;
        }
        long stringExecutionSpeed = System.nanoTime() - startTime;

        for (int z = 0; z < y; z++) {
            testBuilder.append(testString);
        }
        long stringBuilderExecutionSpeed = System.nanoTime() - stringExecutionSpeed - startTime;

        return "Number of iterations - " + y + "\nString concatenation speed: " + stringExecutionSpeed + "\nStringBuilder.append speed: " + stringBuilderExecutionSpeed;
    }

    // task 18. Метод заменяет несколько последовательных одинаковых символов в строке одним.
    // В случае строки равной null возвращает null.
    public static String removeRepeating (String example) {
        if (example != null) {
            StringBuilder exampleInProgress = new StringBuilder(example);

            for (int x = 0; x + 1 < exampleInProgress.length(); x++) {
                if (exampleInProgress.charAt(x) == exampleInProgress.charAt(x + 1)) {
                    exampleInProgress.replace(x + 1, x + 2, "");
                    x--;
                }
            }
            return exampleInProgress.toString();
        }
        return null;
    }

    // task 19. Метод возвращает результат преобразования римской записи числа в арабскую.
    // Распознает значения чисел от 1 до 3999. В случае строки равной null возвращает null.
    public static String convertToArabic (String roman) {
        if (roman != null) {
            int[] calculatingArray = new int[roman.trim().length()];
            for (int x = 0; x < calculatingArray.length; x++) {
                switch(roman.charAt(x)) {
                    case 'M':
                        calculatingArray[x] = 1000;
                        break;
                    case 'D':
                        calculatingArray[x] = 500;
                        break;
                    case 'C':
                        calculatingArray[x] = 100;
                        break;
                    case 'L':
                        calculatingArray[x] = 50;
                        break;
                    case 'X':
                        calculatingArray[x] = 10;
                        break;
                    case 'V':
                        calculatingArray[x] = 5;
                        break;
                    case 'I':
                        calculatingArray[x] = 1;
                        break;
                }
            }
            int arabicNumberCalculating = calculatingArray[0];
            for (int y = 0; y + 1 < calculatingArray.length; y++) {
                if (calculatingArray[y] >= calculatingArray[y + 1]) {
                    arabicNumberCalculating += calculatingArray[y + 1];
                } else {
                    arabicNumberCalculating += (calculatingArray[y + 1] - (calculatingArray[y] * 2)) ;
                }
            }
            return "" + arabicNumberCalculating;
        }
        return null;
    }
}
