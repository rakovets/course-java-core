package com.rakovets.course.java.core.practice.string;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    // Если такого символа нет, то возвращает значение -1. В случае не инициализированной строки или символа возвращает -1.
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

    // task 6. Метод заменяет в строке все сочетания символов ":(" на ":)".
    // В случае строки равной null возвращает null.
    static public String replaceSadEmoji (String sad) {
        if (sad != null) {
            return sad.replace(":(", ":)");
            }
        return null;
    }

    // task 7. Метод возвращает булинное значение true, если параметр строки начинает и заканчивается с параметра слова.
    // В случае строки или слова равных null возвращает false. Метод учитывает регистр параметров.
    static public boolean doesStringStartsAndEndsWithWord (String example, String word) {
        if (example != null && word != null) {
            return (example.startsWith(word) && example.endsWith(word));
        }
        return false;
    }

    // task 8. Метод возвращает количество гласных букв в заданной строке (для английского языка).
    // В случае строки равной null возвращает -1.
    static public int getNumberOfVowels (String example) {
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

    // task 9. Метод возвращает количество всех точек, запятых и восклицательных знаков в строке.
    // В случае строки равной null возвращает -1.
    static public int getNumberOfPunctuationMarks (String example) {
        if (example != null) {
            char[] exampleArray = example.toCharArray();
            int numberOfPunctuationMarks = 0;

            for (char c : exampleArray) {
                if (c == '.' || c == ',' || c == '!') {
                    numberOfPunctuationMarks += 1;
                }
            }
            return numberOfPunctuationMarks;
        }
        return -1;
    }

    //task 10. Метод возвращает булинное значение того, является ли введённая строка палиндромом.
    // В случае строки равной null возвращает false.
    static public boolean isPalindrome (String example) {
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
    static public String[] splitByIndex (String example, int n) {
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
    static public int getNumberOfWords (String example) {
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
    static public String getInitials (String example) {
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
    static public String getOnlyDigits (String example) {
        if (example != null) {
            return example.replaceAll("\\D", "");
        }
        return null;
    }

}
